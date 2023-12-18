import java.util.Scanner;
import java.text.*;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextInt()){
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			int d = in.nextInt();
			int e = in.nextInt();
			int f = in.nextInt();
			double m = a*e - b*d;
			double x = c*e - b*f;
			double y = a*f - c*d;
			x /= m; y /= m;
			NumberFormat fm = NumberFormat.getInstance();
			fm.setMaximumFractionDigits(3);
			fm.setMinimumFractionDigits(3);
			System.out.println(fm.format(x) + " " + fm.format(y));
		}
	}

}