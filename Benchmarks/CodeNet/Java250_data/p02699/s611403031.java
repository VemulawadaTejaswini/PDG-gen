import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int w = sc.nextInt();
		sc.close();

		boolean answer = w >= s;

		printBool(answer);
	}

	public static void printBool(boolean bool) {
		print(bool ? "unsafe" : "safe");
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}
}
