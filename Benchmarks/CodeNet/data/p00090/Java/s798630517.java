
import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				return;
			}
			float[] x = new float[n];
			float[] y = new float[n];
			for (int i = 0; i < n; i++) {
				String str = sc.next();
				String[] s = new String[2];
				s = str.split(",");

				x[i] = Float.parseFloat(s[0]);
				y[i] = Float.parseFloat(s[1]);
			}

			int max = 0;
			for (int i = 0; i < n; i++) {
				int count = 0;
				for (int j = 0; j < n; j++) {
					float d = distance(x[i], y[i], x[j], y[j]);
					if (d <= 4) {
						count++;
					}
				}
				max = Math.max(max, count);
			}
			System.out.println(max);
		}
	}

	public float distance(float x0, float y0, float x1, float y1) {
		return ((x0 - x1) * (x0 - x1) + (y0 - y1) * (y0 - y1));
	}

	public static void main(String[] args) {
		new Main().run();
	}

}