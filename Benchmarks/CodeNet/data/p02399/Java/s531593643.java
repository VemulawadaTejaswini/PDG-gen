import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String []args) {
	Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int d = a/b;
		int r = a%b;
		double f = ((double)a)/b;
		//DecimalFormat df = new DecimalFormat("#.00000");
		//System.out.printf(d+" "+r+" ");
		System.out.printf("%d %d %.5f",d,r,f);
	in.close();
	}
}
