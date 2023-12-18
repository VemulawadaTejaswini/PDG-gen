import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		String str = sc.nextLine();
		int [] a = new int[n];
		int [] b = new int[m];
		for (int i= 0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		str = sc.nextLine();
		for (int i= 0; i<m; i++) {
			b[i] = sc.nextInt();
		}
		sc.close();

		int remine = k;
		int ans = 0;
		int ii=0;
		int jj=0;
		ans = calc(remine, ii, jj, a, b, n, m, ans);

		System.out.println(ans);
	}

	private static int calc(int remine, int ii, int jj, int[] a, int[] b, int n, int m, int ans)
	{
		if (ii == n && jj == m) return ans;
		if (ii == n && remine < b[jj]) return ans;
		if (jj == m && remine <a[ii]) return ans;

		if ((ii == n || remine <a[ii]) && jj < m &&remine > b[jj]) {
			return calc(remine-b[jj], ii, jj+1, a, b, n, m, ans+1);
		}
		if ((jj == m || remine <b[jj]) && ii < n &&remine > a[ii]) {
			return calc(remine-a[ii], ii+1, jj, a, b, n, m, ans+1);
		}
		if (ii < n && remine <a[ii] && jj <m && remine < b[jj]) return ans;

		int ansa = 0;
		if (ii < n) {
			ansa= calc(remine-a[ii], ii+1, jj, a, b, n, m, ans+1);
		}
		int ansb = 0;
		if (jj < m) {
			ansb = calc(remine-b[jj], ii, jj+1, a, b, n, m, ans+1);
		}
		if (ansa>=ansb) {
			return ansa;
		} else {
			return ansb;
		}
	}
}

