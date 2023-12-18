import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		scan.close();

		int n = Integer.parseInt(str1);
		String[] ai = str2.split(" ", 0);

		int sVal = 0;
		int min = Integer.parseInt(ai[0]);
		for (int i = 0; i < n - 1; i++) {
			int num1 = Integer.parseInt(ai[i]);
			int num2 = Integer.parseInt(ai[i + 1]);
			if (num1 <= num2) {
				sVal = num1;
			} else {
				sVal = num2;
			}
			if (sVal <= min) {
				min = sVal;
			}
		}

		int bVal = 0;
		int max = Integer.parseInt(ai[0]);
		for (int i = 0; i < n - 1; i++) {
			int num1 = Integer.parseInt(ai[i]);
			int num2 = Integer.parseInt(ai[i + 1]);
			if (num1 <= num2) {
				bVal = num2;
			} else {
				bVal = num1;
			}
			if (max <= bVal) {
				max = bVal;
			}
		}

		long sum = Integer.parseInt(ai[0]);
		for (int i = 1; i < n; i++) {
			long num = Integer.parseInt(ai[i]);
			sum += num;
		}

		System.out.println(min + " " + max + " " + sum);

	}
}