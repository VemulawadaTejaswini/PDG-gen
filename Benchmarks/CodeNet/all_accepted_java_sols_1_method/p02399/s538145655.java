import java.text.*;
import java.math.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		df.applyPattern("0");
		df.setMaximumFractionDigits(8);
		df.setMinimumFractionDigits(8);

		int kaisu = 2;
		long[] num = new long[kaisu];

		for(int i = 0; i < kaisu; i++) {
			num[i] = scan.nextInt();
		}

		long d = num[0] / num[1];
		long r = num[0] % num[1];
		double nf = num[0] / (double)num[1];
		Double objf = new Double(nf);
		String f = df.format(objf);
		System.out.println(d + " " + r + " " + f);
	}
}