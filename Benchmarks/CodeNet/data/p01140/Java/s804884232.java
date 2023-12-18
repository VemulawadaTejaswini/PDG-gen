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
			int[] height = new int[(1 + n) * n / 2];
			int[] w = new int[m];
			int[] width = new int[(1 + m) * m / 2];
			int hp = 0, wp = 0;
			for (int i = 0; i < n; i++) {
				h[i] = sc.nextInt();
				int hh = h[i];
				height[hp] = hh;
				hp++;
				for (int j = i - 1; j >= 0; j--) {
					hh += h[j];
					height[hp] = hh;
					hp++;
				}
			}
			for (int i = 0; i < m; i++) {
				w[i] = sc.nextInt();
				int ww = w[i];
				width[wp] = ww;
				wp++;
				for (int j = i - 1; j >= 0; j--) {
					ww += w[j];
					width[wp] = ww;
					wp++;
				}
			}
			int result = 0;
			for (int i = 0; i < height.length; i++)
				for (int j = 0; j < width.length; j++)
					if (height[i] == width[j])
						result++;
			System.out.println(result);
		}
		sc.close();
	}
}