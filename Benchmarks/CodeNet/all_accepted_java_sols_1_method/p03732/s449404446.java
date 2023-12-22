import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		ArrayList<Integer>[] all = new ArrayList[4];
		for (int i = 0; i < 4; i++) {
			all[i] = new ArrayList<Integer>();
		}
		int w1 = sc.nextInt();
		int v1 = sc.nextInt();
		all[0].add(v1);
		for (int i = 1; i < n; i++) {
			int ww = sc.nextInt();
			int vv = sc.nextInt();
			all[ww - w1].add(vv);
		}
		for (int i = 0; i < 4; i++) {
			Collections.sort(all[i]);
		}
		int max = 0;
		int va = 0;
		for (int a = 0; a <= all[0].size() && w1 * a <= w; a++) {
			if (a > 0) {
				va += all[0].get(all[0].size() - a);
			}
			int vb = 0;
			for (int b = 0; b <= all[1].size() && w1 * a + (w1 + 1) * b <= w; b++) {
				if (b > 0) {
					vb += all[1].get(all[1].size() - b);
				}
				int vc = 0;
				for (int c = 0; c <= all[2].size() && w1 * a + (w1 + 1) * b + (w1 + 2) * c <= w; c++) {
					if (c > 0) {
						vc += all[2].get(all[2].size() - c);
					}
					int vd = 0;
					for (int d = 0; d <= all[3].size() && w1 * a + (w1 + 1) * b + (w1 + 2) * c + (w1 + 3) * d <= w; d++) {
						if (d > 0) {
							vd += all[3].get(all[3].size() - d);
						}
						int sum = va + vb + vc + vd;
						if (max < sum) {
							max = sum;
						}
					}
				}
			}
		}
		System.out.println(max);
	}
}
