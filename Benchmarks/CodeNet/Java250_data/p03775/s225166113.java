
import java.util.Scanner;

public class Main {

	public static int f(long a, long b) {
		int digit = 0;
		
		if(a < 0 && b < 0)return -1;
		
		long tmp = (long)Math.max(a, b);
		
		while(tmp > 0) {
			tmp /= 10;
			++digit;
		}
		
		return digit;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n;
		n = sc.nextLong();
		sc.close();
		
		int min = 100;
		for(int i = 1; i <= (int)Math.sqrt(n); ++i) {
			if(n % i == 0) {
				min = Math.min(min,  f((n / (long)i), (long)i));
			}
		}
		System.out.println(min);
	}

}
