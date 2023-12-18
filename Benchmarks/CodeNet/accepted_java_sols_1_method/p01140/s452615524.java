import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String str[] = br.readLine().split(" ");
			int n = Integer.parseInt(str[0]);
			int m = Integer.parseInt(str[1]);

			if (n == 0 && m == 0)
				break;

			int h[] = new int[n];
			int w[] = new int[m];
			int height[] = new int[1000*1500+1];
			int width[] = new int[1000*1500+1];

			for (int i = 0; i < n; i++) {
				h[i] = Integer.parseInt(br.readLine());
			}

			for (int i = 0; i < m; i++) {
				w[i] = Integer.parseInt(br.readLine());
			}
			for (int i = 0; i < n; i++) {
				int len = 0;
				for (int j = i; j < n; j++) {
					len += h[j];
					height[len]++;
				}
			}
			for (int i = 0; i < m; i++) {
				int len = 0;
				for (int j = i; j < m; j++) {
					len += w[j];
					width[len]++;
				}
			}
			int count = 0;
			for (int i = 0; i < height.length; i++) {
				count += height[i] * width[i];
			}
			System.out.println(count);
		}
	}
}
