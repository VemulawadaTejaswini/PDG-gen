import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();
		int a = 1;

		while (a != 0) {
			a=0;
			for (int i = 2; i <= X / 2; i++) {
				if (X % i == 0) {
					a++;
				}
			}
			if (a != 0) {
				X++;
			}
		}
		System.out.println(X);
	}
}