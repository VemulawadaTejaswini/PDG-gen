import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();

		long k = n/(a+b);
		long ao = k*a;
		long r = n%(a+b);

		if ( r <= a ) {
			ao = ao + r;
		} else {
			ao = ao + a;
		}
		System.out.println(ao);
	}
}