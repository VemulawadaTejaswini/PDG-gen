import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		long s = sc.nextLong();
		long x1 = 1000000000;
		long y2 = (s + x1 - 1) / x1;
		long x2 = x1 * y2 - s;
		System.out.println("0 0 " + x1 + " 1 " + x2 + " " + y2);
	}
}
