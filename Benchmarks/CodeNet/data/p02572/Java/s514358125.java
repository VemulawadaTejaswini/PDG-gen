import java.util.*;

public class Main {
    static int MOD = 1000_000_007;
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
        	num[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
	        for (int j = i + 1; j < n; j++) {
				sum = (sum + (((num[i] % MOD) * (num[j] % MOD)) % MOD) % MOD);
            }
        }
        System.out.println(sum);
    }
}