import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();

		int a = n % 100;
		int b = (n - a) / 100;

		boolean um = false;
		boolean sm = false;

		if(0 < a && a < 13) um = true;
		if(0 < b && b < 13) sm = true;

		if(um && sm) System.out.println("AMBIGUOUS");
		else if(um) System.out.println("YYMM");
		else if(sm) System.out.println("MMYY");
		else System.out.println("NA");

	}
}