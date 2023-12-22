import java.util.Scanner;
import java.text.*;
public class Main {
	public static void main(String[] args) {
		NumberFormat format = NumberFormat.getInstance();
		format.setMaximumFractionDigits(8);
		Scanner scan = new Scanner(System.in);
		long a=Integer.parseInt(scan.next());
		long b=Integer.parseInt(scan.next());
		System.out.print(a/b+" "+a%b);
		double f = (double)a/b;
		System.out.println(" "+String.format("%8f",f));
		scan.close();
	}
}