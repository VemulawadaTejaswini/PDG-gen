
import java.util.Scanner;

public class Main {
	static int ans;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		gcd(n);
		System.out.println(ans);

	}
	
	static void gcd(int x) {
		boolean jdg = true;
		for(int i = 2 ; i * i <= x ;i++) {
			if(x % i == 0) {
				jdg = false;
				break;
			}
		}
		if(jdg) {
			ans = x;
			return;
		}
		gcd(x+1);
	}

}
