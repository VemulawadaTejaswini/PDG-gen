/**
 * @author yuichirw
 *
 */
import java.util.*;
import static java.lang.Math.*;

public class Main {
	static int n;
	static Scanner sc = new Scanner(System.in);
	
	static boolean read() {
		n = sc.nextInt();
		return (n == 0) ? false : true;
	}
	
	static int solve() {
		int a,b,c,p,w,res;
		a = n / 200; b = n / 300; c = n / 500;
		res = 9999999;
		for(int i = 0; i <= a; i++) {
			for(int j = 0; j <= b; j++) {
				for(int k = 0; k <= c; k++) {
					w = 200 * i + 300 * j + 500 * k;
					if(w == n) {
						p = (int)(((i / 5) * 5 * 0.8  + (i % 5)) * 380 + 
								 ((j / 4) * 4 * 0.85 + (j % 4)) * 550 +
								 ((k / 3) * 3 * 0.88 + (k % 3)) * 850);
						res = min(res, p);
					}
				}
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		while(read()) {
			System.out.println(solve());
		}
	}

}