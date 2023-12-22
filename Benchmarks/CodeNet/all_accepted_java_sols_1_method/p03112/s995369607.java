import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int q = sc.nextInt();
		long max = (long)1e12; long min = -1*(long)1e12;
		long[] s = new long[a+2]; s[0] = min; s[a+1] = max;
		long[] t = new long[b+2]; t[0] = min; t[b+1] = max;
		for (int i = 1; i < a+1; i++) {
			s[i] = sc.nextLong();
		}
		for (int i = 1; i < b+1; i++) {
			t[i] = sc.nextLong();
		}
		StringBuilder sb = new StringBuilder();
		long x = 0; int l = 0;int r = 0; int mid = 0;
		long sl = 0, sr = 0, tl = 0, tr = 0;
		long ans = 0;
		for (int i = 0; i < q; i++) {
			x = sc.nextLong();
			l = -1; r = a+2;
			while(r-l>1) {
				mid = (r+l)/2;
				if(s[mid]>x) {
					r = mid;
				}else {
					l = mid;
				}
			}
			sl = s[l]; sr = s[r];

			l = -1; r = b+2;
			while(r-l>1) {
				mid = (r+l)/2;
				if(t[mid]>x) {
					r = mid;
				}else {
					l = mid;
				}
			}
			tl = t[l]; tr = t[r];
			ans = Math.min((x-sl)+(tr-sl),(x-sl)+Math.abs(tl-sl));
			ans = Math.min(ans, (sr-x)+(sr-tl));
			ans = Math.min(ans,(sr-x)+Math.abs(tr-sr));
			ans = Math.min(ans, (tr-x)+(tr-sl));
			ans = Math.min(ans, (tr-x)+Math.abs(sr-tr));
			ans = Math.min(ans, (x-tl)+Math.abs(tl-sl));
			ans = Math.min(ans,(x-tl)+(sr-tl));
			sb.append(String.valueOf(ans));
			sb.append("\n");
		}
		System.out.println(new String(sb));
		sc.close();
	}
}