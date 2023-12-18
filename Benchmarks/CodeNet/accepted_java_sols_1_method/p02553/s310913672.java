import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long d = sc.nextLong();

		long ac = a*c;
		long ad = a*d;
		long bc = b*c;
		long bd = b*d;

		long maxa = Math.max(ac, ad);
		long maxb = Math.max(bc, bd);

		long maxall = Math.max(maxa, maxb);

		System.out.println(maxall);
	}
}