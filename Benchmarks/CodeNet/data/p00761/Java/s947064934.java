import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			ArrayList<Integer> a = new ArrayList<>();

			String str[] = br.readLine().split(" ");
			int a0 = Integer.parseInt(str[0]);
			int l = Integer.parseInt(str[1]);

			if (a0 == 0 && l == 0)
				break;

			a.add(a0);
			boolean flag = false;
			for (int i = 0;; i++) {
				int next = getA(a.get(i), l);
				if (a.contains(next)) {
					System.out.println(a.indexOf(next) + " " + next + " " + (a.size() - a.indexOf(next)));
					break;
				}
				a.add(next);
			}
		}
	}

	static int getA(int a, int l) {
		String s = String.valueOf(a);

		while (s.length() < l)
			s = "0" + s;

		char[] num1 = s.toCharArray();
		char[] num2 = s.toCharArray();

		Arrays.sort(num1);

		for (int i = 0; i < l; i++)
			num2[i] = num1[l - 1 - i];

		int max = Integer.parseInt(String.valueOf(num2));
		int min = Integer.parseInt(String.valueOf(num1));

		return max - min;
	}
}
