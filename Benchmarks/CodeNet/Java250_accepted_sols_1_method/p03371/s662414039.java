import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int A = sc.nextInt();
        final int B = sc.nextInt();
        final int C = sc.nextInt();
        final int X = sc.nextInt();
        final int Y = sc.nextInt();
        final int min = Math.min(X, Y);
        final int max = Math.max(X, Y);

        System.out.println(Math.min(Math.min(A + B, 2 * C) * min + A * (X - min) + B * (Y - min), max * 2 * C));
    }
}
