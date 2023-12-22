
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args){
		int a, b, d, r;
		double f;
		DecimalFormat t = new DecimalFormat("0.00000");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		d = a / b;
		r = a % b;
		f =1.0 * a / b;
		System.out.println(d + " " + r + " " + t.format(f));
	}
}