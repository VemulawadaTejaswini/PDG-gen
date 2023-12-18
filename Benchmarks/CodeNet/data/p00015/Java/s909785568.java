import java.math.BigDecimal;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count = Integer.parseInt(sc
				.nextLine());

		for (int i = 0; i < count; i++) {

			String output = new BigDecimal(sc
					.nextLine()).add(
							new BigDecimal(sc
									.nextLine()))
							.toString();

			if (output.length() > 80) {
				output = "overflow";
			}

			System.out.println(output);
		}
	}
}