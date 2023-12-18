import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextInt();
		long b = scan.nextInt();
		int d = (int) (a/b);
		int r = (int) (a%b);
		float f = (float)a/(float)b;
		DecimalFormat df2 = new DecimalFormat("0.00000000");


		System.out.println(d+" "+r+" "+df2.format(f));

	}

}