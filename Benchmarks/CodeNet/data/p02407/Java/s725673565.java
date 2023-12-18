import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int num[] = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = scanner.nextInt();
		}
		for (int c = 1; c <= n; c++) {
			System.out.print(num[n - c]);
			if(n-c!=0) {
				System.out.print(" ");
			}
		}
		System.out.println();
		scanner.close();
	}
}

