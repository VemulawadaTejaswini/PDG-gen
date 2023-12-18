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
			int[] height = new int[1500001];
			int[] w = new int[m];
			int[] width = new int[1500001];
			for (int i = 0; i < n; i++) {
				h[i] = sc.nextInt();
				int hh = h[i];
				height[hh]++;
				for (int j = i - 1; j >= 0; j--) {
					hh += h[j];
					height[hh]++;
				}
			}
			for (int i = 0; i < m; i++) {
				w[i] = sc.nextInt();
				int ww = w[i];
				width[ww]++;
				for (int j = i - 1; j >= 0; j--) {
					ww += w[j];
					width[ww]++;
				}
			}
			int result = 0;
			for (int i = 0; i < height.length; i++)
				result += height[i] * width[i];
			System.out.println(result);
		}
		sc.close();
	}
}