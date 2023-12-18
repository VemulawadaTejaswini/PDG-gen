import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int [] ans = new int[n+1];
		ans[0] = 1;
		ans[1] = 1;
		int [] ans2 = new int[n+1];
		ans2[0] = 1;
		ans2[1] = 1;

		int [] a = new int[m];
		int [] b = new int[m];

		for (int i=0; i<m; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		sc.close();
		String ansS = "Yes";
		int i = 1;
		check(i, a, b, ans, ans2, m, n);
		//System.out.println(ans);
	}

	private static void check(int i, int[] a, int[] b, int[] ans, int[] ans2, int m, int n)
	{
		//System.out.println("check"+i);
		int [] target = new int[n];
		if (i == 1) {
			for (int j =0; j<m; j++) {
				if (a[j] == i ) {
					if (ans[b[j]] == 0) {
						ans[b[j]] = i;
						ans2[b[j]] = i;
					}
				} else if (b[j]== i) {
					if (ans[a[j]]==0) {
						ans[a[j]]= i;
						ans2[a[j]]= i;
					}
				}
			}
		} else {
			int k = 0;
			for (int j=2; j<n+1; j++) {
				if (ans2[j] == i -1) {
					target[k] = j;
					k +=1;
				}
			}
			for (int f = 0; f<k+1; f++) {
			for (int j =0; j<m; j++) {
				//System.out.println("j="+j+"f="+f);
				if (a[j] == target[f] ) {
					if (ans[b[j]] == 0) {
						ans[b[j]] = target[f];
						ans2[b[j]] = i;
					}
				} else if (b[j]== target[f]) {
					if (ans[a[j]]==0) {
						ans[a[j]]= target[f];
						ans2[a[j]]= i;
					}
				}
			}
			}
		}
		if (all_done(ans, n)) {
			end_result(ans, n);
			return;
		} else {
			check(i+1, a, b, ans, ans2, m, n);
		}
	}

	private static void end_result(int[] ans, int n)
	{
		System.out.println("Yes");
		for (int i=2; i<n+1; i++) {
			System.out.println(ans[i]);
		}

	}

	private static boolean all_done(int[] ans, int n)
	{
		for (int i=2; i<n+1; i++) {
			if (ans[i] == 0) return false;
		}
		return true;
	}
}
