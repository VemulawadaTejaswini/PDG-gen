import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();

		int r = 0;
		int b = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'R') {
				r++;
			} else {
				b++;
			}
		}
		if (b < r) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
