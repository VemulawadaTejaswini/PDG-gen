import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), i = 1, no = N, t = 1, j = 1;
		boolean ok = false;
		int[] a = new int[N+1];
		while (N-->0) a[i++] = sc.nextInt();
		while (no-->0) {
			if (a[j]==2) { ok = true; break; }
			j = a[j]; t++;
		}
		System.out.println(ok ? t : -1);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}