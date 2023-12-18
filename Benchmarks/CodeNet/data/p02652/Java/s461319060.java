import java.util.Scanner;

public class Main {
	static char[] s;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		s = sc.next().toCharArray();
		sc.close();

		int ok = s.length;
		int ng = 0;
		while (Math.abs(ok - ng) > 1) {
			int mid = (ok + ng) / 2;
			if (can(mid)) {
				ok = mid;
			} else {
				ng = mid;
			}
		}
		System.out.println(ok);
	}

	static boolean can(int mid) {
		int val = 1;
		int cnt0 = 0;
		int cnt1 = 0;
		int cntx = 0;
		int cnt00m = 0;
		int cnt11m = 0;
		int cnt00p = 0;
		int cnt11p = 0;
		int max00m = 0;
		int max11m = 0;
		int max00p = 0;
		int max11p = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == '0') {
				cnt0++;
				cnt00m++;
				cnt00p++;
				if (cnt11m > 0) {
					cnt11m--;
				}
				if (cnt11p > 0) {
					cnt11p--;
				}
				val = Math.max(val, cnt00p);
				val = Math.max(val, Math.max(Math.abs(cnt0 - cnt1) - cntx, 0));
			} else if (s[i] == '1') {
				cnt1++;
				cnt11m++;
				cnt11p++;
				if (cnt00m > 0) {
					cnt00m--;
				}
				if (cnt00p > 0) {
					cnt00p--;
				}
				val = Math.max(val, cnt11p);
				val = Math.max(val, Math.max(Math.abs(cnt0 - cnt1) - cntx, 0));
			} else {
				if (cnt00m == mid) {
					cnt1++;
					cnt11m++;
					cnt11p++;
					cnt00m--;
					cnt00p--;
					val = Math.max(val, cnt11p);
					val = Math.max(val, Math.max(Math.abs(cnt0 - cnt1) - cntx, 0));
				} else if (cnt11m == mid) {
					cnt0++;
					cnt00m++;
					cnt00p++;
					cnt11m--;
					cnt11p--;
					val = Math.max(val, cnt00p);
					val = Math.max(val, Math.max(Math.abs(cnt0 - cnt1) - cntx, 0));
				} else {
					cntx++;
					if (cnt00m > 0) {
						cnt00m--;
					}
					if (cnt11m > 0) {
						cnt11m--;
					}
					cnt00p++;
					cnt11p++;
				}
			}
			max00m = Math.max(max00m, cnt00m);
			if (max00m > mid) {
				return false;
			}
			max11m = Math.max(max11m, cnt11m);
			if (max11m > mid) {
				return false;
			}
			max00p = Math.max(max00p, cnt00p);
			max11p = Math.max(max11p, cnt11p);
		}

		if (val <= mid) {
			return true;
		}
		int val2 = Math.max(max00p - mid, 0) + Math.max(max11p - mid, 0);
		if (val2 <= cntx * 2) {
			return true;
		}
		return false;
	}
}
