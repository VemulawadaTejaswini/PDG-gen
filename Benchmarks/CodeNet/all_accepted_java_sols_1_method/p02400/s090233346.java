import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 double r = scan.nextDouble();
		DecimalFormat df = new DecimalFormat("0.000000");
		double s = r*r*Math.PI;
		double a = r*2*Math.PI;
		System.out.println(df.format(s)+" "+df.format(a));

	}

}