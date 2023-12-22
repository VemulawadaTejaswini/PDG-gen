import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();

		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		sb.append("");

		for (int i = 0; i < n; i++) {
			sb.append(s[i]);
			sb.append(t[i]);
		}
		System.out.println(sb.toString());
		sc.close();
	}
}