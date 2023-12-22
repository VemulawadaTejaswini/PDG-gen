import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		int ans = 0;

		for (int i = 1; i <= b - a; i++) {
			ans += i;
		}
		System.out.println(ans - b);
	}
}
