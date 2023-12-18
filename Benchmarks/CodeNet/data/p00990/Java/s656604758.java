import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	int n, m;
	char[] id;
	char[] a;
	
	int calc(int d, int s) {
		if (d == n+1) {
			if (s % 10 == 0) return 1;
			else return 0;
		} else {
			if (id[n-d] != '*') {
				int t =Integer.parseInt(""+id[n-d]);
				if (d % 2 == 0) {
					if (t*2 < 10)
						return calc(d+1, s+t*2);
					else {
						return calc(d+1, s+1+t*2-10);
					}
				} else {
					return calc(d+1, s+t);
				}
			} else {
				int sum = 0;
				for (int i = 0; i < m; i++) {
					id[n-d] = a[i];
					sum += calc(d, s);
				}
				id[n-d] = '*';
				return sum;
			}
		}
	}
	
	void run() {
		n = sc.nextInt(); 
		String ID = sc.next(); 
		id = ID.toCharArray();
		m = sc.nextInt();
		a = new char[m];
		for (int i = 0; i < m; i++)
			a[i] = sc.next().charAt(0);
		
		out.println(calc(1, 0));
		
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}