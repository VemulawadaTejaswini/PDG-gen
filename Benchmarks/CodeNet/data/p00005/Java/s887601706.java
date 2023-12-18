package Volume0;

import java.io.IOException;
import java.util.Scanner;



public class Main{
	
	public static long tmp;

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			long a = scan.nextLong();
			long b = scan.nextLong();
			long gcd = divide(a, b);
			// int だと桁が足りない。
			long lcm = a * b / gcd;
			System.out.println(gcd + " " + lcm);
			
		}
		

	}
	
	public static long divide(long a, long b) {
		long r = 0;
		if (a < b) {
			long temp = b;
			b = a;
			a = temp;
		}
		r = a % b;
		
		if (r != 0){
			tmp = r;
			divide(b, tmp);
		}
		return tmp;
		
	}

}