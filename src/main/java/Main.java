public class Main {
    public static void main(String[] args) {
        try{
            System.out.println("Hello World");
            Thread.sleep(1000);
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
