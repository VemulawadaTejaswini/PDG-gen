import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	static PrintStream o = System.out;
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		short thealth = sc.nextShort();
		short tattack = sc.nextShort();
		short ahealth = sc.nextShort();
		short aattack = sc.nextShort();
		while (true) {
			ahealth -= tattack;
			if (ahealth <= 0) {
				o.println("Yes");
				break;
			}
			thealth -= aattack;
			if (thealth <= 0) {
				o.println("No");
				break;
			}
		}
	}
}