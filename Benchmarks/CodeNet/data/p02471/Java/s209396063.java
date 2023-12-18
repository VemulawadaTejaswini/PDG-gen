import java.util.Scanner;
public class Main {
	
	static int x;
	static int y;
	
	static int gcd(int a, int b) {
		int d = a;
		if(b != 0) {
			int tmp;
			tmp = x;
			x = y;
			y = tmp;
			d = gcd(b, a%b);
			
			tmp = x;
			x = y;
			y = tmp;
			y -= (a / b) * x;
		}
		else {
			x = 1; 
			y = 0;
		}
		return d;
	}
			
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			gcd(a, b);
			
			System.out.println(x + " " + y);
		}
	}
}

