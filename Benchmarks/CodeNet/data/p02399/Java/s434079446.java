import java.util.*;
import java.text.*;
public class Main {

	public static void main(String[] args) {
		NumberFormat format = NumberFormat.getInstance();
		format.setMaximumFractionDigits(5);
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println((a/b) + " " + (a%b) + " " + format.format(((float)a/(float)b)));
	}

}