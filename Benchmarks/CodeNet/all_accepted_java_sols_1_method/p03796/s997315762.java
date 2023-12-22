import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long MOD = 1_000_000_007;
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
            ans %= MOD;
        }
        System.out.println(ans);
    }

}
