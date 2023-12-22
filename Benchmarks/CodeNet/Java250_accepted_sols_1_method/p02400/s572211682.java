
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double menseki = Math.PI * r * r;
		double enshu = Math.PI * 2 * r;
		DecimalFormat decimalFormat = new DecimalFormat("0.00000");
		System.out.println(decimalFormat.format(menseki) + " " + decimalFormat.format(enshu));
	}
}