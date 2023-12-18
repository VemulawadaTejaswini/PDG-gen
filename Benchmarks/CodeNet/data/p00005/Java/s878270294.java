import java.util.Scanner;

public class Main {
	public static long gcd(long a, long b) {
		if(a < b) {
			long tmp = a;
			a = b;
			b = tmp;
		}
		while(b != 0) {
			long r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			long g = gcd(a, b);
			long l = a / g * b;
			System.out.println(g + " " + l);
		}
		sc.close();
	}

}

