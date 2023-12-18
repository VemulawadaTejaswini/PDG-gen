import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long v = sc.nextLong();
		long b = sc.nextLong();
		long w = sc.nextLong();
		long t = sc.nextLong();

		if ( v<=w ) {
			System.out.println("NO");
			System.exit(0);
		}

		int dir = 0;
		if ( b>a ) dir = 1;
		else       dir = -1;

		long dist = Math.abs(a-b);

		long rec = Math.abs(v-w);

		if ( dist<=rec*t ) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}