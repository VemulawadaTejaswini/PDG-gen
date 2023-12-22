
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] s = sc.nextLine().split(" ");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		int d = a / b;
		int r = a % b;
		double af = (double) a;
		double bf = (double) b;

		double f = af / bf;

		System.out.println(d + " " + r + " " + new DecimalFormat("0000000000.0000000000").format(f));
	}
}