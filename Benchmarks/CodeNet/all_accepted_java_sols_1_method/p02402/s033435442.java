import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a = scanner.nextInt();
		long max = a;
		int min = a;
		long total = a;
		for (int i = 0; i< n-1; ++i) {
			int b = scanner.nextInt();
			total = total + b;
			if (max < b) {
				max = b;
			} else if (min > b) {
				min = b;
			}
			

		}

		System.out.println(min + " " + max + " " + total);
	}
}

