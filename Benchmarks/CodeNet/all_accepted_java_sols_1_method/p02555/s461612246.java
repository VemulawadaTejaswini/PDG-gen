import java.util.*;

public class Main {
	static long MOD = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int S = sc.nextInt();

		long[][] comb = new long[2010][2010];
		for(int i=0; i<2010; i++) {
			for(int j=0; j<=i; j++) {
				if(j==0 || j==i) {
					comb[i][j] = 1;
				} else {
					comb[i][j] = (comb[i-1][j-1] + comb[i-1][j])%MOD;
				}
			}
		}
		
		long ans = 0;
		
		for(int i=1; i<=S/3; i++) {
			ans = (ans + comb[S-i*2-1][i-1])%MOD;
		}
		
		System.out.println(ans);
		sc.close();
	}
	
}
