

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String strNum = String.valueOf(n);
		int sum = 0;
		for (int i = 0; i < strNum.length(); i++) {
			sum += Integer.parseInt(strNum.substring(i, i + 1));
		}
		
		if (n % sum == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		scanner.close();

	}

}
