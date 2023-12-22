import java.text.*;
import java.math.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int kaisu = 1;
		double[] num = new double[kaisu];

		for(int i = 0; i < kaisu; i++) {
			num[i] = scan.nextDouble();
		}
		double pai = 3.14159265358979;
		double ensyu = pai * 2 * num[0];
		double menseki = num[0] * num[0] * pai;

		DecimalFormat df = new DecimalFormat();
		df.applyPattern("0");
		df.setMaximumFractionDigits(6);
		df.setMinimumFractionDigits(6);

		String e = df.format(ensyu);
		String m = df.format(menseki);
		System.out.println(m + " " + e);
	}
}