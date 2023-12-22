import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("####################.####################");

		String a = scan.next();
		String b = scan.next();

		int result1 = Integer.parseInt(a) / Integer.parseInt(b);
		int result2 = Integer.parseInt(a) % Integer.parseInt(b);
		double result3 = Double.parseDouble(a) / Double.parseDouble(b);

		System.out.println(result1 + " " + result2 + " " + df.format(result3));

		scan.close();

	}
}