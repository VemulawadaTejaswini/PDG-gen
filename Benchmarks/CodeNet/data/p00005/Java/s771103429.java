import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNext()) {
			int a = s.nextInt();
			int b = s.nextInt();
			
			int g = lcm(a,b);
			int l = gcd(a,b);
			System.out.println(l + " " + g);
		}
		
	}
	static int lcm(int a, int b) {
		for(int i = b; i <= 2000000000; i += b) {
			if(i % a == 0) {

				return i;
			}
		}
		return -1;
	}
	static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}