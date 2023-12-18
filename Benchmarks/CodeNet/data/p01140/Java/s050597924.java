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
			int[] w = new int[m];
			int[] height = new int[n * (n + 1) / 2];
			int[] width = new int[m * (m + 1) / 2];
			for (int i = 0; i < n; i++)
				h[i] = sc.nextInt();
			for (int i = 0; i < m; i++)
				w[i] = sc.nextInt();
			int result = 0;
			int pointer = 0;
			for (int i = 0; i < m; i++) {
				int wid = 0;
				for (int j = i; j < m; j++) {
					wid += w[j];
					width[pointer] = wid;
					pointer++;
				}
			}
			pointer = 0;
			for (int i = 0; i < n; i++) {
				int hei = 0;
				for (int j = i; j < n; j++) {
					hei += h[j];
					height[pointer] = hei;
					pointer++;
				}
			}
			Arrays.sort(width);
			Arrays.sort(height);
			for (int i : width)
				for (int j : height) {
					if (i == j)
						result++;
					if (i < j)
						break;
				}
			System.out.println(result);
		}
		sc.close();
	}
}