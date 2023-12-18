import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		DecimalFormat df1 = new DecimalFormat("0.00000");
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a / b + " " + a % b + " " + df1.format((double)a / b));
	}
}