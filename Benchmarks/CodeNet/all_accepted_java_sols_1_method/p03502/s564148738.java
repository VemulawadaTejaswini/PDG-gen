import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), sum = 0;
		String s = String.valueOf(n);

		for (int j = 0; j < s.length(); j++) {
			sum += Character.getNumericValue(s.charAt(j));
		}

		if (n % sum == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}