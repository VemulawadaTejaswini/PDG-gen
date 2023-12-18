import java.util.*;

class Main {
	static int N;
	static int[] p, d;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			N = sc.nextInt();
			if (N == 0)
				break;
			p = new int[N];
			d = new int[N];
			for (int i = 0; i < N; ++i) {
				p[i] = sc.nextInt();
				d[i] = sc.nextInt();
			}

			ArrayList<int[]> mul_lis = new ArrayList<>();
			for (int i = 0; i < N; ++i) {
				if (d[i] > 1)
					mul_lis.add(new int[] { p[i], d[i] });
			}
			Collections.sort(mul_lis, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					return Integer.compare(o1[0], o2[0]);
				}
			});

			ArrayList<Integer> mul = new ArrayList<>();
			ArrayList<Integer> sin = new ArrayList<>();
			for (int i = 0; i < N; ++i) {
				if (d[i] == 1)
					sin.add(p[i]);
			}
			for (int i = 0; i < mul_lis.size(); ++i) {
				for (int j = 0; j < mul_lis.get(i)[1] - 1 - ((i == 0 || i == mul_lis.size() - 1) ? 0 : 1); ++j) {
					mul.add(mul_lis.get(i)[0]);
				}
			}
			Collections.sort(sin);
			Collections.sort(mul);
			long[][] dp = new long[mul.size()][sin.size()];
			long ans = 0;
			for (int i = 0; i < mul.size(); ++i)
				Arrays.fill(dp[i], Long.MAX_VALUE / 16);
			if (sin.size() > 0) {
				dp[0][0] = Math.abs(mul.get(0) - sin.get(0));
				for (int i = 0; i < mul.size(); ++i) {
					for (int j = 0; j < sin.size(); ++j) {

						if (i > 0)
							dp[i][j] = Math.min(dp[i][j], dp[i - 1][j]);
						if (i > 0 && j > 0)
							dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - 1] + Math.abs(mul.get(i) - sin.get(j)));
					}
				}
				ans = dp[mul.size() - 1][sin.size() - 1];
			}
			ans += mul_lis.get(mul_lis.size() - 1)[0] - mul_lis.get(0)[0];
			if (ans >= Long.MAX_VALUE / 16) {
				System.out.println(-1);
			} else
				System.out.println(ans);
		}
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}