import java.util.Scanner;

public class Main {

	static int solve(String s, String t) {
		int min = 1001;

		for (int i = 0; i < s.length() - t.length() + 1; i++) {
			int count = 0;
			for (int j = 0; j < t.length(); j++) {
				if (s.charAt(i + j) != t.charAt(j))
					count++;
			}
			if (count < min)
				min = count;
		}

		return min;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		String s, t;
		s = stdIn.next();
		t = stdIn.next();
		int result = solve(s, t);
		System.out.println(result);

		stdIn.close();
	}
}
