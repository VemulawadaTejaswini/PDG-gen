import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String string = sc.next();
		int ans = 0;
		int len = string.length();

		for (int i = 0; i < len; i++) {
			if (string.charAt(i) != string.charAt(len - 1 - i)) {
				ans++;
			}
		}

		System.out.println(ans / 2);

		sc.close();
	}

}
