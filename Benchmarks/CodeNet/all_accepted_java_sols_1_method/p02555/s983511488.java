import java.util.*;

public class Main {
    static final int MOD = 1000000007;
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int size = n + 1;
    	long[][] comb = new long[size][size];
    	for (int i = 0; i < size; i++) {
    	    for (int j = 0; j <= i; j++) {
    	        if (j == 0 || j == i) {
    	            comb[i][j] = 1;
    	        } else {
    	            comb[i][j] = (comb[i - 1][j - 1] + comb[i - 1][j]) % MOD;
    	        }
    	    }
    	}
    	long ans = 0;
    	for (int i = 1; i * 3 <= n; i++) {
    	    int count = n - i * 3;
    	    ans += comb[count + i - 1][count];
    	    ans %= MOD;
    	}
	    System.out.println(ans);
	}
}