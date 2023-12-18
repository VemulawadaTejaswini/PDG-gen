import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

        System.out.println(solve(X));
    }

    private static int solve(int X) {
        int count = 0;

        int total = 0;
        while (true) {
            count++;
            total += X;
            total %= 360;

            if (total%360 == 0) break;
        }

        return count;
    }
}