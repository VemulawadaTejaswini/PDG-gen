
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	private void run() throws IOException {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int x = scanner.nextInt();
			int n = scanner.nextInt();
			int e = scanner.nextInt();
			if ((x | n | e) == 0)
				break;
			int[] v = new int[x];
			for (int i = 0; i < x; i++) {
				v[i] = scanner.nextInt();
			}
			int[][] ev = new int[n + 1][2];
			while (e-- > 0) {
				int p = scanner.nextInt();
				int k = scanner.nextInt();
				int val = scanner.nextInt();
				ev[p][0] = k;
				ev[p][1] = val;
			}
			Map<Integer, double[]> map = new HashMap<Integer, double[]>();
			double[] d = new double[n + 1];
			d[0] = 1.0;
			map.put(0, d);
			for (int i = 0; i < n; i++) {
				Map<Integer, double[]> tmpMap = new HashMap<Integer, double[]>();
				tmpMap.putAll(map);
				for (Entry<Integer, double[]> entry : map.entrySet()) {
					if (entry.getValue()[i] == 0)
						continue;
					for (int k = 0; k < x; k++) {
						int c = entry.getKey();
						int nm = Math.min(n, i + v[k]);
						if (ev[nm][0] == 1)
							nm = Math.min(n, nm + ev[nm][1]);
						else if (ev[nm][0] == 2)
							c += ev[nm][1];
						else if (ev[nm][0] == 3)
							c = Math.max(0, c - ev[nm][1]);
						double[] tmp;
						double np = entry.getValue()[i] / x;
						if (!tmpMap.containsKey(c)) {
							tmp = new double[n + 1];
							tmp[nm] = np;
							tmpMap.put(c, tmp);
						} else {
							tmp = tmpMap.get(c);
							tmp[nm] += np;
						}

					}
				}
				map = tmpMap;
			}
			double ans = 0;
			for (Entry<Integer, double[]> entry : map.entrySet()) {
				ans += entry.getKey() * entry.getValue()[n];
			}
			System.out.println((int) ans);
		}
	}
}