import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);

		double a = scan.nextInt();

		double radi = a * a * 3.141592653589;
		double circ = 2 * a * 3.141592653589;

		String radi2 = String.format("%.6f", radi);
		String circ2 = String.format("%.6f", circ);

		System.out.println(radi2 + " " + circ2);
	}
}

