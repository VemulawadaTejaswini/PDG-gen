import java.util.*;
import static java.lang.System.*;
import java.math.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			BigInteger a = new BigInteger(sc.next());
			BigInteger b = new BigInteger(sc.next());
			BigInteger c = a.add(b);
			if (a.toString().length()>80 || b.toString().length()>80 || c.toString().length()>80) {
				out.println("overflow");
			}
			else {out.println(c);}
		}
	}
}
