import java.math.*;
import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();
		if (isPrime(x)) {
			System.out.println(x);
		} else  {
				while (!isPrime(x)) {
					x++;
				}
				System.out.println(x);
			}
		}

		public static boolean isPrime (int a) {
			BigInteger bi = BigInteger.valueOf(a);
			return bi.isProbablePrime(1);
		}
}
