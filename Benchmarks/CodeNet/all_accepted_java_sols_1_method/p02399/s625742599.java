import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		DecimalFormat df = new DecimalFormat("0.000000000000000000000000000000");
		System.out.print(a / b + " " + a % b + " " + df.format((double)a / b));
		
		sc.close();
	}

}