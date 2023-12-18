import java.util.Scanner;
 
public class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();
		long c = in.nextLong();
		long d = in.nextLong();
		long prod = 1;
      if(b>= 0 && d >= 0) prod = b*d;
      if(a<= 0 && c<=0) prod = (prod > a*c) ? prod : a*c;
        prod = Math.max(prod, Math.min(b,d) * Math.max(a,c));
      System.out.println(prod);
	}
}