import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		sc.close();

		double a = ((double)L) / 3.0;
		DecimalFormat df = new DecimalFormat("0.000000000000");
		System.out.println(df.format(a * a * a));
	}
}
