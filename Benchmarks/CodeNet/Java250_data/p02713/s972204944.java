import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		int ans = 0;
		for(int a = 1 ; a <= k ; a++) {
			for(int b = 1 ; b <= k ; b++) {
				for(int c = 1 ; c <= k ; c++) {
					ans += gcd(a,b,c);
				}
			}
		}
		System.out.println(ans);
		scan.close();
	}

	private static int gcd(int a, int b, int c) {
		int d = gcd2(a,b);
		
		return gcd2(c,d);
		
	}

	private static int gcd2(int a, int b) {
		if(b == 0) return a;
		
		return a % b == 0 ? b : gcd2(b , a % b);
	}

}
