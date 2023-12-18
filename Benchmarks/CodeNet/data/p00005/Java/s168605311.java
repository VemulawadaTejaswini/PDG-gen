import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a,b;
		while(true){
			a = cin.nextInt();
			b = cin.nextInt();
			System.out.println(gcd(a,b)+" "+lcm(a,b));
		}
	}

	private static int gcd(int a, int b) {
		if(b == 0)
			return a;
		else
			return gcd(b,a%b);
	}

	private static int lcm(int a, int b) {
		return a*b/gcd(a,b);
	}
}