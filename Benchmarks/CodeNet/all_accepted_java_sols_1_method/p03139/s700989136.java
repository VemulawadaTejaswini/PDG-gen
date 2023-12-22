import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }

        if (n - a - b < 0) {
            System.out.println(-1 * (n - a - b));
        } else {
            System.out.println(0);
        }
    }
}