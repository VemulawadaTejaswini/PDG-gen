import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int k = Integer.parseInt(sa[1]);
		sa = br.readLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sa[i]);
		}
		br.close();

		int ok = 1000000000;
		int ng = 0;
		while (Math.abs(ok - ng) > 1) {
			int mid = (ok + ng) / 2;
			if (count(a, mid) <= k) {
				ok = mid;
			} else {
				ng = mid;
			}
		}
		System.out.println(ok);
	}

	static long count(int[] a, int val) {
		long cnt = 0;
		for (int i = 0; i < a.length; i++) {
			cnt += (a[i] - 1) / val;
		}
		return cnt;
	}
}
