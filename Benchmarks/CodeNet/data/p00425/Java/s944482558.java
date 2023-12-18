import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int sum = 1;
			int[] v = { 1, 2, 3, 5, 4, 6 };
			for (int i = 0; i < N; ++i) {
				String q = sc.next();
				if (q.equals("North")) {
					int tmp = v[0];
					v[0] = v[1];
					v[1] = v[5];
					v[5] = v[3];
					v[3] = tmp;
				} else if (q.equals("East")) {
					int tmp = v[0];
					v[0] = v[4];
					v[4] = v[5];
					v[5] = v[2];
					v[2] = tmp;
				} else if (q.equals("South")) {
					int tmp = v[0];
					v[0] = v[3];
					v[3] = v[5];
					v[5] = v[1];
					v[1] = tmp;
				} else if (q.equals("West")) {
					int tmp = v[0];
					v[0] = v[2];
					v[2] = v[5];
					v[5] = v[4];
					v[4] = tmp;
				} else if (q.equals("Right")) {
					int tmp = v[1];
					v[1] = v[2];
					v[2] = v[3];
					v[3] = v[4];
					v[4] = tmp;
				} else if (q.equals("Left")) {
					int tmp = v[1];
					v[1] = v[4];
					v[4] = v[3];
					v[3] = v[2];
					v[2] = tmp;
				}
				sum += v[0];
			}
			System.out.println(sum);
		}
	}
}