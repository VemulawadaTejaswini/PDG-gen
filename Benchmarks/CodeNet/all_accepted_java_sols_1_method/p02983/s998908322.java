import java.util.Scanner;

public class Main {

    static final int MOD = 2019;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        sc.close();

        int min = l % MOD;
        int max = Math.min((r - l), MOD);
        int ans = MOD;
        for (int i = min; i <= min + max; i++) {
            for (int j = i + 1; j <= min + max; j++) {
                int tmp = (i * j) % MOD;
                if (tmp < ans) {
                    ans = tmp;
                }
            }
        }
        System.out.println(ans);
    }

}
