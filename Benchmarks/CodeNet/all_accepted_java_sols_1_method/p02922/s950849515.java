import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int t = 0;

		while ((a - 1) * t + 1 < b) {
			t++;
		}
		System.out.println(t);
		sc.close();
	}
}
