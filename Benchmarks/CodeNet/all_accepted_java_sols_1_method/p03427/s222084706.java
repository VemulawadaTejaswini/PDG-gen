import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();

		boolean nine = true;
		int sum = 0;
		for (int i = 1; i < n.length(); i++) {
			if (Character.getNumericValue(n.charAt(i)) != 9) nine = false;
			sum += 9;
		}

		if (nine) {
			sum += Character.getNumericValue(n.charAt(0));
		} else {
			sum += Character.getNumericValue(n.charAt(0)) - 1;
		}

		System.out.println(sum);

		sc.close();
	}

}
