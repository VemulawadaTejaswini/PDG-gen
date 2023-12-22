import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        a = a == 1 ? 14 : a;
        b = b == 1 ? 14 : b;
        if (a > b) {
            System.out.println("Alice");
        } else if (b > a) {
            System.out.println("Bob");
        } else {
            System.out.println("Draw");
        }
    }
}