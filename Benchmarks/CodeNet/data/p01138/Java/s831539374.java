import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int[] start = new int[N];
			int[] end = new int[N];
			for (int i = 0; i < N; ++i) {
				start[i] = parse(sc.next());
				end[i] = parse(sc.next());
			}
			int ans = 0;
			for (int i = 0; i < N; ++i) {
				int c = 0;
				for (int j = 0; j < N; ++j) {
					if (start[j] <= end[i] - 1 && end[j] > end[i] - 1) ++c;
				}
				ans = Math.max(ans, c);
			}
			System.out.println(ans);
		}
	}

	static int parse(String time) {
		int h = Integer.parseInt(time.substring(0, 2));
		int m = Integer.parseInt(time.substring(3, 5));
		int s = Integer.parseInt(time.substring(6, 8));
		return h * 3600 + m * 60 + s;
	}
}