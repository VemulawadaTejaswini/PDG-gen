/**
 * @author yuichirw
 *
 */
import java.util.*;

public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int a,b,rel,sum;
		String c;

		for(int i = 0; i < 9; i++) {
			c = sc.next(); a = sc.nextInt(); b = sc.nextInt();
			sum = a + b;
			rel = a * 200 + b * 300;
			System.out.println(c + " " + sum + " " + rel);
		}
	}
}