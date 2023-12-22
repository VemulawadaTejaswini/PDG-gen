import java.util.*;
import java.math.*;
/**
 * @author yamato
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double H = scanner.nextInt();
		double A = scanner.nextInt();
		double ans = Math.ceil(H/A);
		
		System.out.println((int)ans);
		
	}

}