import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	class S implements Comparable<S> {
		int t;
		int c;
		int time2;

		S(int t, int c) {
			this.t = t;
			this.c = c;
		}

		public int compareTo(S tar) {
			return t - tar.t;
		}
	}

	void run() {
		for (;;) {
			int n = sc.nextInt();

			if (n == 0) {
				break;
			}

			S[] s = new S[n];

			for (int i = 0; i < n; i++) {
				int t = sc.nextInt();
				int c = sc.nextInt();
				s[i] = new S(t, c);
			}

			Arrays.sort(s);

			int time = 0;
			// forward
			LinkedList<S> fw = new LinkedList<S>();
			// backward
			LinkedList<S> bw = new LinkedList<S>();

			for (int i = 0; i < n; i++) {
				fw.add(s[i]);
			}

			int time2[] = new int[n];
			int ans = 0;
			for (;;) {
				if (fw.isEmpty() && bw.isEmpty()) {
					break;
				}

				if (!fw.isEmpty()) {
					// waiting to back
					LinkedList<S> wfb = new LinkedList<S>();

					while (!fw.isEmpty()&& fw.getFirst().time2 >= fw.getFirst().t) {
						S g = fw.pollFirst();
						g.time2 = 0;
						wfb.addLast(g);
					}

					Collections.sort(wfb);
					bw.addAll(wfb);
				}
				if (!bw.isEmpty()) {
					// waiting to forward
					LinkedList<S> wbf = new LinkedList<S>();

					while (!bw.isEmpty() && bw.getFirst().time2 >= bw.getFirst().t) {
						S g = bw.pollFirst();
						g.time2 = 0;
						g.c--;
						if (g.c != 0) {
							wbf.addLast(g);
						}
					}

					Collections.sort(wbf);
					fw.addAll(wbf);
				}
				for (S a : fw) {
					a.time2++;
				}
				for (S a : bw) {
					a.time2++;
				}
				ans++;
			}
			System.out.println(ans-1);
		}
	}

	public static void main(String[] a) {
		Main m = new Main();
		m.run();
	}
}