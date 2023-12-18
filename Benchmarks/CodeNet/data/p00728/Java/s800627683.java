import java.io.IOException;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		while (true) {
			int n = nextInt();
			if (n == 0) {
				break;
			}
			int[] points = new int[n];
			for (int i = 0; i < points.length; i++) {
				points[i] = nextInt();
			}
			Arrays.sort(points);
			int sum = 0;
			for (int i = 1; i < points.length - 1; i++) {
				sum += points[i];
			}
			System.out.println(sum / (n - 2));
		}

	}

	static int nextInt() {
		int c;
		try {
			c = System.in.read();
			while (c != '-' && (c < '0' || c > '9'))
				c = System.in.read();
			if (c == '-')
				return -nextInt();
			int res = 0;
			while (c >= '0' && c <= '9') {
				res = res * 10 + c - '0';
				c = System.in.read();
			}
			return res;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}

}