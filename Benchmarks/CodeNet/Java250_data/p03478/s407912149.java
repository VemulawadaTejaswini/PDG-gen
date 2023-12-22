import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		int summary = 0;
		for (int i = 1; i <= N; i++) {
			String numString = String.valueOf(i);
			char[] numCharList = numString.toCharArray();
			int sum = 0;
			for (char numChar : numCharList) {
				sum += Character.getNumericValue(numChar);
			}
			if (A <= sum && sum <= B) {
				summary += i;
			}
		}
		System.out.println(summary);


	}
}
