import java.util.*;

public class Main {
    static final int MOD = 1000000007;
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] arr = new int[n];
    	for (int i = 0; i < n; i++) {
    	    arr[i] = sc.nextInt();
    	}
    	int[] sums = new int[n];
    	sums[n - 1] = arr[n - 1];
    	for (int i = n - 2; i >= 0; i--) {
    	    sums[i] = (sums[i + 1] + arr[i]) % MOD;
    	}
    	long total = 0;
    	for (int i = 0; i < n - 1; i++) {
    	    total += (long)arr[i] * sums[i + 1] % MOD;
    	    total %= MOD;
    	}
    	System.out.println(total);
    }
}
