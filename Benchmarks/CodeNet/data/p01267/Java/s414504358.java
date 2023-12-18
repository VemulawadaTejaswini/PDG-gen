import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		ArrayList<Integer> results = new ArrayList<>();

		while (true) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			StringTokenizer stringTokenizer = new StringTokenizer(str, " ");

			int n = Integer.valueOf(stringTokenizer.nextToken()); // ??????????????°
			int a = Integer.valueOf(stringTokenizer.nextToken()); // ?????°
			int b = Integer.valueOf(stringTokenizer.nextToken()); // ?????°
			int c = Integer.valueOf(stringTokenizer.nextToken()); // ?????°
			int x = Integer.valueOf(stringTokenizer.nextToken()); // ?????¨?????±??°

			if (n == 0 && a == 0 && b == 0 && c == 0 && x == 0) {
				break;
			}

			ArrayList<Integer> list = new ArrayList<Integer>();
			br = new BufferedReader(new InputStreamReader(System.in));
			str = br.readLine();
			stringTokenizer = new StringTokenizer(str, " ");

			for (int i = 0; i < n; i++) {
				list.add(Integer.valueOf(stringTokenizer.nextToken()));
			}

			int frame = 0;
			int railCount = 0;

			while (true) {
				if (frame > 10000) {
					frame = -1;
					break;
				}
				if (list.get(railCount) == x) {
					railCount++;
					if (railCount == n) {
						break;
					}
				}
				x = createRandomNum(a, b, c, x);
				frame++;
			}

			results.add(frame);
		}

		for (int result : results) {
			System.out.println(result);
		}
	}

	public static int createRandomNum(int a, int b, int c, int x) {
		return (a * x + b) % c;
	}

}