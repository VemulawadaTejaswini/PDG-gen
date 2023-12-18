import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();

		int ans = 1;
		for (int i = 2; i <= X; i++) {
			int pow = i * i;
			while (pow <= X) {
				ans = Math.max(ans, pow);
				pow *= i;
			}
		}
		System.out.println(ans);
	}
}
