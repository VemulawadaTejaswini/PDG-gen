import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("####################.####################");

		double r = scan.nextDouble();

		System.out.println(df.format(r * r * Math.PI) + " " + df.format((r+r) * Math.PI));


		scan.close();

	}
}