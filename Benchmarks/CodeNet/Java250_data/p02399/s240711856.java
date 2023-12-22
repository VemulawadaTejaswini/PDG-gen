import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();

		double z = (double)x / (double)y;
		String zz =  String.format("%.5f", z);
		System.out.println(x / y + " " + x % y + " " + zz);
	}
}