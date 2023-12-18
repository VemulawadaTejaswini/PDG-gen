import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (n == 0 && m == 0)
				break;
			int[] h = new int[n];
			List<Integer> height = new ArrayList<Integer>(0);
			int[] w = new int[m];
			List<Integer> width = new ArrayList<Integer>(0);
			int maxh = 0, maxw = 0;
			for (int i = 0; i < n; i++) {
				h[i] = sc.nextInt();
				int hh = h[i];
				height.add(hh);
				for (int j = i - 1; j >= 0; j--) {
					hh += h[j];
					height.add(hh);
				}
				maxh = Math.max(maxh, hh);
			}
			for (int i = 0; i < m; i++) {
				w[i] = sc.nextInt();
				int ww = w[i];
				width.add(ww);
				for (int j = i - 1; j >= 0; j--) {
					ww += w[j];
					width.add(ww);
				}
				maxw = Math.max(maxw, ww);
			}
			int[] hh = new int[maxh + 1];
			int[] ww = new int[maxw + 1];
			for (int i : height)
				hh[i]++;
			for (int i : width)
				ww[i]++;
			int result = 0;
			for (int i = 0; i < Math.min(hh.length, ww.length); i++)
				result += hh[i] * ww[i];
			System.out.println(result);
		}
		sc.close();
	}
}