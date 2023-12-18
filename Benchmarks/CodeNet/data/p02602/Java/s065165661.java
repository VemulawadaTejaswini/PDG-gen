import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int[] test = new int[n];

		for (int i = 0; i < n; i++) {
			test[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < n - k; i++) {
			printBool(test[i + k] > test[i]);
		}

	}

	public static void printBool(boolean bool) {
		print(bool ? "Yes" : "No");
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}
