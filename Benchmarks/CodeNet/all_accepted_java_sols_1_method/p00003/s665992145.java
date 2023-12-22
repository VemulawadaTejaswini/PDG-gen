import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int a2 = a * a;
			int b2 = b * b;
			int c2 = c * c;
			if (a2 == b2 + c2 || b2 == a2 + c2 || c2 == a2 + b2) {
				System.out.println("YES");
			} else
				System.out.println("NO");
		}
		sc.close();
	}
}