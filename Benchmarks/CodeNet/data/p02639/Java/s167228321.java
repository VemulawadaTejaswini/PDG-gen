import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int x4 = sc.nextInt();
        int x5 = sc.nextInt();

        System.out.println(solve(x1, x2, x3, x4, x5));
    }

    private static int solve(int x1, int x2, int x3, int x4, int x5) {
        if (x1 == 0) return 1;
        if (x2 == 0) return 2;
        if (x3 == 0) return 3;
        if (x4 == 0) return 4;

        return 5;
    }
}