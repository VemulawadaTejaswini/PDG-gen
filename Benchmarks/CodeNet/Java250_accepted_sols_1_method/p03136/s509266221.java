import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.next());
		int[] l = new int[n];
		for (int i = 0; i < n; i++) {
			l[i] = Integer.parseInt(s.next());
		}

		int[] sl = Arrays.stream(l)
				.sorted()
				.toArray();

		int sum = 0;
		for (int i = 0; i < n - 1; i++) {
			sum += sl[i];
		}

		String ans = null;

		if (sum > sl[n - 1]) {
			ans = "Yes";
		} else {
			ans = "No";
		}
		System.out.println(ans);
	}
}