import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
            //Scanner op = new Scanner(System.in);
        b = input.nextInt();
            if (a < b) {
                System.out.println("a < b");
            }
            if (a == b) {
                System.out.println("a == b");
            }
            if (a > b) {
                System.out.println("a > b");
            }
    }

}
