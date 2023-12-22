import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] L = new int[m];
		int[] R = new int[m];
		for(int i = 0; i < m; i++) {
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
		}
		int lmax = L[0];
		int rmin = R[0];
		for(int i = 1; i < m; i++) {
			lmax = Math.max(lmax, L[i]);
			rmin = Math.min(rmin, R[i]);
		}
		int ans = Math.max(rmin - lmax + 1, 0);
		System.out.println(ans);
		sc.close();
	}
}
