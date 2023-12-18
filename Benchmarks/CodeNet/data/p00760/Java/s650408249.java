
import java.util.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Main {
	
	void run() {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int max = count(1000, 1, 1);
		for(int t=0;t<n;t++) {
			int ds = count(sc.nextInt(), sc.nextInt(), sc.nextInt());
			System.out.println(max - ds);
		}
		
	}
	
	int count(int Y, int M, int D) {
		int y = 1, m = 1, d = 1;
		int c = 0;
		for(;;) {
			if( Y == y && M == m && D == d ) {
				return c;
			}
			
	
		d++;
			c++;
			if(y%3==0) {
				if(d == 21) {
					d = 1;
					m++;
				}
			}
			else {
				if(m%2 == 1) {
					if(d == 21) {
						d = 1;
						m++;
					}
				}
				else {
					if( d == 20 ) {
						d = 1;
						m++;
					}
				}
			}
			if( m == 11 ) {
				m = 1;
				y++;
			}
		}
	}
	
	void debug(Object... os  ) {
		System.err.println(deepToString(os));
	}
	
	public static void main(String[] args ) {
		new Main().run();
	}
}