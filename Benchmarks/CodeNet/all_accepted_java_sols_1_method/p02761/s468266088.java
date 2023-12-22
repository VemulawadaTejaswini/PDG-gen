import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		int num = 0;

		ArrayList<Integer> set = new ArrayList<>();
		ArrayList<Integer> setC = new ArrayList<>();

		if (m == 0) {
			num = (int) Math.pow(10, n - 1);
			if (n == 1)
				System.out.println("0");
			else
				System.out.println(num);
		} else {
			for (int i = 0; i < m; i++) {
				str = br.readLine().split(" ");
				int s = Integer.parseInt(str[0]);
				int c = Integer.parseInt(str[1]);

				if (s == 1 && c == 0 && n > 1) {
					System.out.println("-1");
					return;
				}

				for (int j = 0; j < set.size(); j++) {
					if (set.get(j) == s && setC.get(j) != c) {
						System.out.println("-1");
						return;
					}
				}
				if (set.indexOf(s) == -1) {
					num += (int) Math.pow(10, n - s) * c;
					set.add(s);
					setC.add(c);
				}

			}
			if (set.indexOf(1) == -1)
				System.out.println(num + (int) Math.pow(10, n - 1));
			else
				System.out.println(num);
		}
	}
}
