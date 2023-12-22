import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		String t = sc.next();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			char[] c = {s.charAt(i), t.charAt(i)};
			sb.append(c);
		}

		System.out.println(sb.toString());

		sc.close();
	}
}
