import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] input = new String[N];
		for (int i = 0; i < input.length; i++) {
			String[] tmp = sc.next().split("");
			Arrays.sort(tmp);
			input[i] = String.join("", tmp);
		}
		Arrays.sort(input);
		long res = 0;
		int conn = 0;
		String before = "";
		for (String element : input) {
			if (before.equals(element)) {
				conn++;
				res += conn;
			} else {
				conn = 0;
			}
			before = element;
		}
		System.out.println(res);
	}
}