import java.io.*;
import java.util.*;
import java.lang.ArrayIndexOutOfBoundsException;
import java.math.*;


class Main {
	static Scanner sc = new Scanner(new InputStreamReader(System.in));
	public static void main(String[] args) throws Exception {
		BigInteger n = new BigInteger(sc.next());
		BigInteger m = new BigInteger(sc.next());
		System.out.println(n.modPow(m, new BigInteger("1000000007")));
	}
}