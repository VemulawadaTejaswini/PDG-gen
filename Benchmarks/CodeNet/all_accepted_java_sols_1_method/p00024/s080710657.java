import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while ( sc.hasNext() ) {
			int i = 0;
			double in = sc.nextDouble();
			double t = in / 9.8;
			double y = 4.9 * (t*t);
			for ( i = 0; (5*i-5) < y; i++ );
			System.out.println(i);
		}
	}
}