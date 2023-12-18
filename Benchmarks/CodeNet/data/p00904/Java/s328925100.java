import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	int isSquare(int n) {
		for (int i = (int)Math.sqrt(n); i*i <= n; i++) {
			if (i*i == n) return i;
		}
		return -1;
	}
	
	void run() {
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			int p = sc.nextInt(), q = sc.nextInt();
			int pq2 = p*p+q*q;
			if (pq2 <= 1) {
				out.println("C");
			} else {
				boolean flag = false;
				J:for (int j = 2; j*j <= pq2; j++) {
					if (pq2 % j == 0) {
						for (int m = 0; m*m <= j; m++) {
							int n;
							if ((n=isSquare(j-m*m)) > 0) {
								if ((m*p+n*q)%(m*m+n*n) == 0 && (m*q-n*p)%(m*m+n*n) == 0) {
									flag = true;
									break J;
								}
							}
						}
					}
				}
				if (flag) out.println("C");
				else out.println("P");
			}
			
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}