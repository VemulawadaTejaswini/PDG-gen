import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		a += sc.next();
		int n = Integer.parseInt(a);
		boolean b = false;
		for (int i = 1; i * i <= n; i++) {
			if (n == i * i) {
				b = true;
				break;
			}
		}
		if (b) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
