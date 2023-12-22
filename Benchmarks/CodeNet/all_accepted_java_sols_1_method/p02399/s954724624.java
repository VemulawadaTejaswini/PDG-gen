import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author ??\???
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long a = scanner.nextInt();
		long b = scanner.nextInt();
		scanner.close();
		
		DecimalFormat df = new DecimalFormat("0.00000");
		
		System.out.println((a / b) + " " + (a % b) + " " + df.format(((double) a / b)));
	}

}