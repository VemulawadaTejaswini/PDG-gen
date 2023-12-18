import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        sc.close();

        int b = (Y - 2 * X);
        if (b % 2 != 0) {
            System.out.println("No");
        }

        b /= 2;
        int a = X - b;

        if (a >= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        return;
    }
}
