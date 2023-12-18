import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		BigInteger n = BigInteger.ONE;
		Long a = Long.parseLong(sc.next());
		String bb = sc.next();
		long b = ((long)bb.charAt(0) - 48) * 1000 + 100 * ((long)bb.charAt(2) - 48) + ((long)bb.charAt(3) - 48) * 10;
		n = n.multiply(BigInteger.valueOf(a));
		n = n.multiply(BigInteger.valueOf(b));
		n = n.divide(BigInteger.valueOf((long)1000));
		ou.println(n);
		ou.flush();
	}
}