import java.util.Scanner;

public class Main {
	static int a,b;
	static Scanner cin = new Scanner(System.in);
	public static void main(String[] args) {
		while(read()){
			System.out.println(gcd(a,b)+" "+lcm(a,b));
		}
	}

	private static boolean read() {
		if(!cin.hasNext())
        	return false;
        a = cin.nextInt();
        b = cin.nextInt();
		return true;
	}

	private static long gcd(int a, int b) {
		if(b == 0)
			return a;
		else
			return gcd(b,a%b);
	}

	private static long lcm(int a, int b) {
		return a*b/gcd(a,b);
	}
}