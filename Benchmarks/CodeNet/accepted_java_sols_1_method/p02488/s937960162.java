import java.util.*;

/* No.10021 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String min = sc.next();
		for ( int i = 0; i < n-1; i++ ) {
			String in = sc.next();
			if ( in.compareTo(min) < 0 ) min = in;
		}
		System.out.println(min);
	}
}