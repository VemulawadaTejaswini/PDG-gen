import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] tmp1 = scanner.nextLine().split(" ");
		int n  = Integer.parseInt(tmp1[0]);
		int m  = Integer.parseInt(tmp1[1]);
		long k = Long.parseLong(tmp1[2]);
		String[] a1 = scanner.nextLine().split(" ");
		String[] b1 = scanner.nextLine().split(" ");
		long[] alist = new long[n];
		long[] blist = new long[m];

		for(int i = 0; i < n; i++) alist[i] = Long.parseLong(a1[i]);
		for(int i = 0; i < m; i++) blist[i] = Long.parseLong(b1[i]);

		int  ans = 0;
		long now = 0;
		int a = 0;
		int b = 0;

		while(now <= k && k >= 0) {

			if(a < n && b < m) {

				now = Math.min(alist[a], blist[b]);
				if(now == alist[a])a++;
				else b++;

			}else if(a < n && b >= m) {

				now = alist[a];
				a++;

			}else if(a >= n && b < m) {

				now = blist[b];
				b++;

			}else {

				break;

			}

			k -= now;
			if(k >= 0) {
			ans++;
			}
		}


 		System.out.println(ans);
	}
}