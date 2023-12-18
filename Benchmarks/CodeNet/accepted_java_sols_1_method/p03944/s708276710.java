import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int W = Integer.parseInt(str[0]);
		int H = Integer.parseInt(str[1]);
		int n = Integer.parseInt(str[2]);

		int xmin = 0;
		int xmax = W;
		int ymin = 0;
		int ymax = H;
		for (int i = 0; i < n; i++) {
			str = br.readLine().split(" ");
			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[1]);
			int a = Integer.parseInt(str[2]);
			if (a == 1)
				xmin = Math.max(xmin, x);
			if (a == 2)
				xmax = Math.min(xmax, x);
			if (a == 3)
				ymin = Math.max(ymin, y);
			if (a == 4)
				ymax = Math.min(ymax, y);
		}
		int ans = Math.max(0, xmax - xmin) * Math.max(0, ymax - ymin);
		System.out.println(ans);
	}
}
