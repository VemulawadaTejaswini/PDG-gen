
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();

		int sum = 0;
		for (int i = 0; i < n.length(); i++) {
			sum += Integer.parseInt(n.substring(i,i+1));
		}

		String result = "";
		if (sum % 9 == 0) {
			result = "Yes";
		} else {
			result = "No";
		}
		System.out.println(result);

		sc.close();

	}

}
