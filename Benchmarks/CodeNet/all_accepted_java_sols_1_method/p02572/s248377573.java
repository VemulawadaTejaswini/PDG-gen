import java.util.*;

public class Main {
    static int MOD = 1000_000_007;
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
        	num[i] = sc.nextInt();
            sum += num[i];
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            sum -= num[i];
            ans = (int) (ans + ((num[i] % MOD) * (sum % MOD)) % MOD) % MOD;
        }
        System.out.println(ans);
    }
}