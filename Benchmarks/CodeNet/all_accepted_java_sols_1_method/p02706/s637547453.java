import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int aSum = 0;
		for (int i = 0; i < m; i++) {
			aSum += scan.nextInt();
		}
		if (n >= aSum) {
			System.out.println(n - aSum);
		} else {
			System.out.println(-1);
		}

	}
}