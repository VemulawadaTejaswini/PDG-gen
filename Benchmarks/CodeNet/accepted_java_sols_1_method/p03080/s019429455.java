import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();

		int ans = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'R') {
				ans++;
			} else {
				ans--;
			}
		}

		System.out.println(ans > 0 ? "Yes" : "No");

		sc.close();
	}
}
