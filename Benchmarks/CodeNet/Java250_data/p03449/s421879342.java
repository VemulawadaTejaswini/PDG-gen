import java.util.*;
// warm-up
// Good one
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), i = 0, r = 0, t = 0, max=Integer.MIN_VALUE;
		int[][] g = new int[2][n];
		int[] ltor = new int[n];
		int[] rtol = new int[n];
		while (r<2) {
			while (i<n) g[r][i++] = sc.nextInt();	
			r++; i=0;
		}
		i=0; t=0;
		for (int a : g[0]) { t+=a; ltor[i++]=t; }
		i=0; t=0;
		for (i=n-1; i>=0; i--) { t+=g[1][i]; rtol[i]=t; }
		for (i=0; i<n; i++) max = Math.max(ltor[i]+rtol[i], max);
		System.out.println(max);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}