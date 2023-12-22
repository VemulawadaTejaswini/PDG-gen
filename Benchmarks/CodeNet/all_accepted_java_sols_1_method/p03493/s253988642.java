import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String n = sc.next();

		char[] str = new char[n.length()];

		int count = 0;
		for (int i = 0; i < n.length(); i++) {
			String tmp = String.valueOf(n.charAt(i));

			if (tmp.equals("1")) {
				count++;
			}
		}

		// 出力
		System.out.println(count);
	}
}