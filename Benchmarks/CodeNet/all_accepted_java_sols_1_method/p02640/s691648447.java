import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        sc.close();

        if (Y % 2 == 1) {
            System.out.println("No");
            return;
        }

        double ans = Y / 2 - X;

        if (ans < 0 || ans > X || ans % 1 != 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
