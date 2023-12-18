import java.util.*;
import java.io.*;
import java.math.*;



public class Main {
	
	private static long gcd(long n, long m) {
//		int tmp = 0;
		while(n != m) {
			if(n > m) {
				n -= m;
			}
			else {
				m-= n;
			}
		}
		
		
		return n;
	}

//	private static int lcm(int n, int m) {
//		return n*m/gcd(n,  m);
//	}
	
	public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
        	long n = scan.nextInt();
        	long m = scan.nextInt();
        	long gcd = gcd(n, m);
        	System.out.println(gcd + " " + n * m / gcd);
        	
        }

        
	}
}
 