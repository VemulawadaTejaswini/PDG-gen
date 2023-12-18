import java.util.*;
public class Main { 
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			String a = stdIn.next();
			if(a.equals("#")) break;
			if(a.length() == 5) {
				System.out.println(0);
				continue;
			}
			if(a.length() == 4) {
				System.out.println(90);
				continue;
			}
			int b = 0;
			int c = 1;
			
			int d = a.length()-1;
			if(a.charAt(d) == 'h') {
				d-= 5;
			}
			else {
				d-=4;
				b = 90;
			}
			
			while(true) {
				if(d <= 0) break;
				c = c << 1;
				if(a.charAt(d) == 'h') {
					d -= 5;
					b = 2 * b - 90;
					continue;
				}
				else {
					d -= 4;
					b = 2 * b + 90;
					continue;
				}
			}
			
			int gcd = gcd(b,c);
			if(b % c == 0) {
				System.out.println(b / c);
			}
			else {
				System.out.println(b/gcd + "/" + c/gcd);
			}
		}
	}
	
	public static int gcd(int b, int c) {
		
		if(c == 0) return b;
		return gcd(c,b%c);
	}
}