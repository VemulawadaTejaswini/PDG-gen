import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static long MOD = 1000000007;

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			int n = sc.nextInt();
			int k = sc.nextInt();

			ArrayList<Long> a = new ArrayList<>(n);
			boolean containPlus = false;
			for (int i = 0; i < n; i++) {
				long value = sc.nextLong();
				if (value > 0) {
					containPlus = true;
				}
				a.add(value);
			}

			Collections.sort(a, new Comparator<Long>() {

				//絶対値の降順ソート
				@Override
				public int compare(Long o1, Long o2) {

					if (Math.abs(o1) > Math.abs(o2)) {
						return -1;
					} else if (Math.abs(o1) == Math.abs(o2)) {
						return 0;
					} else {
						return 1;
					}

				}
			});

			List<Long> selected = new ArrayList<>();
			if (k == n) {
				selected = a;
			} else if (containPlus == false && k % 2 == 1) {
				selected = a.subList(n - k, n);
			} else {

				int minusCount = 0;
				for (int i = 0; i < k; i++) {
					if (a.get(i) < 0) {
						minusCount++;
					}
				}

				if (minusCount % 2 == 0) {
					selected = a.subList(0, k);
				} else {
					selected = a.subList(0, k);

					//負の数を1つ取り除き、非負の数を1つ加える
					long x1 = Long.MAX_VALUE;
					for (int i = k - 1; 0 <= i; i--) {
						long value = a.get(i);
						if (value < 0) {
							x1 = value;
							break;
						}
					}
					long y1 = Long.MIN_VALUE;
					for (int i = k; i < n; i++) {
						long value = a.get(i);
						if (value > 0) {
							y1 = value;
							break;
						}
					}

					//正の数を1つ取り除き、負の数を1つ加える
					long x2 = Long.MIN_VALUE;
					for (int i = k - 1; 0 <= i; i--) {
						long value = a.get(i);
						if (value > 0) {
							x2 = value;
							break;
						}
					}
					long y2 = Long.MAX_VALUE;
					for (int i = k; i < n; i++) {
						long value = a.get(i);
						if (value < 0) {
							y2 = value;
							break;
						}
					}

					long v1 = Math.abs(x1 * y2);
					long v2 = Math.abs(x2 * y1);
					if (x1 == Long.MAX_VALUE || y1 == Long.MIN_VALUE || (v1 < v2)) {
						selected.remove(x2);
						selected.add(y2);
					} else if (x2 == Long.MIN_VALUE || y2 == Long.MAX_VALUE) {
						selected.remove(x1);
						selected.add(y1);
					} else {
						throw new Exception();
					}
				}
			}

			long result = 1;

			for (Long value : selected) {
				result = ((result * value) % MOD + MOD) % MOD;
			}
			System.out.println(result);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}