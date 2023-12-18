import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int T = sc.nextInt();
			P[] ps = new P[N];
			for (int i = 0; i < N; ++i) {
				ArrayList<Integer> period = new ArrayList<Integer>();
				while (true) {
					int t = sc.nextInt();
					if (t == 0) break;
					period.add(t);
				}
				ps[i] = new P(i, period);
			}
			int ans = 0;
			ArrayDeque<P> wait = new ArrayDeque<P>();
			P charge = null;
			for (int i = 0; i < T; ++i) {
				ans += wait.size();
				for (int j = 0; j < N; ++j) {
					P p = ps[j];
					if (p.stage % 2 == 0) {
						p.spend++;
						if (p.spend == p.period[p.stage]) {
							p.spend = 0;
							p.stage++;
							wait.add(p);
						}
					}
				}
				if (charge != null) {
					charge.spend++;
					if (charge.spend == charge.period[charge.stage]) {
						charge.spend = 0;
						charge.stage++;
						if (charge.stage == charge.period.length) charge.stage = 0;
						charge = null;
					}
				}
				if (charge == null && !wait.isEmpty()) {
					charge = wait.poll();
				}
			}
			System.out.println(ans);
		}
	}

	static class P {
		int id;
		int[] period;
		int stage = 0;
		int spend = 0;

		P(int id, ArrayList<Integer> per) {
			this.id = id;
			this.period = new int[per.size()];
			for (int i = 0; i < per.size(); ++i) {
				this.period[i] = per.get(i);
			}
		}
	}

}