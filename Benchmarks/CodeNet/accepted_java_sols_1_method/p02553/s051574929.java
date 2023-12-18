import java.util.Scanner;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();
		long c = in.nextLong();
		long d = in.nextLong();
		long prod = Long.MIN_VALUE;
      prod = Math.max(prod, b*d);
      prod = Math.max(prod, a*c);
        prod = Math.max(prod, Math.min(b,d) * Math.max(a,c));
      System.out.println(prod);
	}
}