import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();
        int W = sc.nextInt();

        System.out.println(solve(S, W));
    }

    private static String solve(int S, int W) {
        return S <= W ? "unsafe" : "safe";
    }
}