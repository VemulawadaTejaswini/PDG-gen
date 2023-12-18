import java.util.*;
class Main {

	static Scanner in = new Scanner(System.in);

	private class Info {
		public int a = 0;
		public int b = 0;
		public int[] costOrTime = new int[2];
		Info(int a, int b, int cost, int time) {
			this.a = a; this.b = b; this.costOrTime[0] = cost; this.costOrTime[1] = time;
		}
	}

	Comparator<Info> cmp = new Comparator<Info>() {
		@Override public int compare(Info o1, Info o2) {
			int x = o1.a - o2.a;
			if (x==0) {
				int y = o1.b - o2.b;
				if (y!=0) return y;
			}
			return x;
		}
	};

	int n = 0;
	int m = 0;

	List<Info> infoList = new ArrayList<Info>();

	int k = 0;
	int[] p = null;
	int[] q = null;
	int[] r = null;

	int ans = 0;

	void prepare() throws RuntimeException {
		n = in.nextInt();
		m = in.nextInt();
		if ((n|m)==0) throw new RuntimeException();
		infoList.clear();
		for (int i = 0; i < n; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			infoList.add(new Info(
				Math.min(a,b),
				Math.max(a,b),
				in.nextInt(),
				in.nextInt()
			));
		}
		Collections.sort(infoList, cmp);

		k = in.nextInt();
		p = new int[k];
		q = new int[k];
		r = new int[k];
		for (int i = 0; i < k; i++) {
			p[i] = in.nextInt();
			q[i] = in.nextInt();
			r[i] = in.nextInt();
		}
	}

	void solve(int start, int term, int type) {
		int[] dp = new int[m+1];
		for (Info info : infoList) {
			if (info.a<start || term<info.b) continue;
			dp[info.b] = (dp[info.b]==0)?
				dp[info.a] + info.costOrTime[type] :
				Math.min(dp[info.b], dp[info.a] + info.costOrTime[type]);
		}
		System.err.printf("[%d][%d][%d] %s\n",start,term,type,Arrays.toString(dp));
		ans = dp[term];
	}

	void answer() {
		System.out.printf("%d\n", ans);
	}

	public static void main(String...args) {
		Main main = new Main();
		try {
			main.prepare();
			for (int i = 0; i < main.k; i++) {
				main.solve(main.p[i], main.q[i], main.r[i]);
				main.answer();
			}
		} catch (Exception e) {
		}
	}
}