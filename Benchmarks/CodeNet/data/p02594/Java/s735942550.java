import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
public class Main {
	public static long twoCount(long a){
		long count = 0;
		while(a%2 == 0){
			a = a/2;
			count++;
		}
		return count;
	}

	private static long calcGcd(long m, long n) {
        if (m <= 0 || n <= 0) {
            throw new IllegalArgumentException("Arguments must be 1 and over.");
        }
        if(m < n) {
            long tmp = m;
            m = n;
            n = tmp;
        }
        long remainder = 0;
        while ((remainder = m % n) != 0) {
            m = n;
            n = remainder;
        }
        return n;
    }

    private static long calcLcm(long m, long n) {
        return m * n / calcGcd(m, n);
    }
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int X = s.nextInt();
	
	
	

	if(X >= 30){
		System.out.println("Yes");
	}else{
		System.out.println("No");
	}
    
  }
}