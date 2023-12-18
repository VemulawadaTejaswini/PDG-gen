import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();

        System.out.println(solve(X, Y) ? YES : NO);
    }

    private static boolean solve(int X, int Y) {
        if (2 * X <= Y && Y <= 4*X && Y%2 == 0) return true;

        return false;
    }
}