
import java.io.*;
import java.math.*;
import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	class P {
		long x;
		long y;

		P(long x, long y) {
			this.x = x;
			this.y = y;
		}

		P org(P a) {
			return new P(x - a.x, y - a.y);
		}
		
	}

	void run() {
		for (;;) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			if ((n | m) == 0) {
				break;
			}

			P b[] = new P[n];
			P w[] = new P[m];

			for (int i = 0; i < n; i++) {
				b[i] = new P(sc.nextLong(), sc.nextLong());
			}
			for (int i = 0; i < m; i++) {
				w[i] = new P(sc.nextLong(), sc.nextLong());
			}

			boolean ok = false;

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {

					boolean check = true;
					P rot = b[i].org(w[j]);
					
					for (int x = 0; x < n && check; x++) {
						if(i == x){
							continue;
						}
						
						P org = b[x].org(w[j]);
						
						long v = org.y * rot.x - org.x *rot.y;
						if(v < 0){
							check = false;
						}
						if(v == 0){
							long v2 =rot.x * org.x + rot.y*org.y;
							if(v2 < 0){
								check = false;
							}
						}
						
					}
					for (int x = 0; x < m && check; x++) {
						if(j == x){
							continue;
						}
						
						P org = w[x].org(w[j]);
						long v = org.y * rot.x - org.x *rot.y;
						if(v > 0){
							check = false;
						}
						if(v == 0){
							long v2 =rot.x * org.x + rot.y*org.y;
							if(v2 > 0){
								check = false;
							}
						}
						
					}

					if(check){
//						System.out.println(i+" " + j);
						ok = true;
						break;
					}
				}
				if (ok) {
					break;
				}
			}
			System.out.println(ok ? "YES" : "NO");

		}

	}

	public static void main(String[] a) {
		Main m = new Main();
		m.run();
	}
}