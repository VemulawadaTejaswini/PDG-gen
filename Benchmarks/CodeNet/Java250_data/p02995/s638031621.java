import java.util.Arrays;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		long A  = keyboard.nextLong();
		long B  = keyboard.nextLong();
		long C  = keyboard.nextLong();
		long D  = keyboard.nextLong();
		
		long b = 0;
		long a = 0;
		
		b = B - (B/C +B/D - B/(lcm(C, D)));
		a = (A-1) - ((A-1)/C +(A-1)/D - (A-1)/(lcm(C, D)));

		System.out.println(b - a);
		keyboard.close();	
	}
	
	private static long lcm(long m, long n) {
    return m * n / gcd(m, n);
	}
	
	private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
        }
}
