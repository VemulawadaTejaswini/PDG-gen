import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		sc.close();

		int doubleTimes = 0;
		while (a >= b) {
			b = b * 2;
			doubleTimes++;
		}
		while (b >= c) {
			c = c * 2;
			doubleTimes++;
		}
		boolean answer = k >= doubleTimes;

		printBool(answer);
	}

	public static void printBool(boolean bool) {
		print(bool ? "Yes" : "No");
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}
