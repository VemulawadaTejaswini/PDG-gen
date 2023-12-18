import java.util.*;
import java.text.*;
public class Main {

	public static void main(String[] args) {
		NumberFormat format = NumberFormat.getInstance();
		format.setMaximumFractionDigits(5);
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.printf((a/b) + " " + (a%b) + " " + "%.5f" + '\n', ((float)a/(float)b));
	}

}