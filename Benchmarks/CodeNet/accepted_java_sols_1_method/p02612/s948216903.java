public class Main {

    public static void main(String[] args) {
        int price = new java.util.Scanner(System.in).nextInt();
        int pay = 0;
        while (pay < price) {
            pay += 1000;
        }
        System.out.println(pay - price);
    }
}
