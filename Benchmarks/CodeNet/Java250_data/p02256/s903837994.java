import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	public static long gcd(long a, long b){
		if(b == 0){ return a; }
		else {return gcd(b, a % b);}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		final long a = sc.nextLong();
		final long b = sc.nextLong();
		
		System.out.println(gcd(a, b));
		
	}
}