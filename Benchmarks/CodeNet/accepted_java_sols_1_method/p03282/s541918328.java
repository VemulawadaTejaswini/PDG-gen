
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String str = scan.next();
		long k = scan.nextLong();
		int result = 0;
		for (int i = 0; i <= k - 1; i++) {
			if (Character.getNumericValue(str.charAt(i)) == 1) {
				result = Character.getNumericValue(str.charAt(i));
			} else {
				result = Character.getNumericValue(str.charAt(i));
				break;
			}
		}
		System.out.println(result);
		scan.close();

	}

}