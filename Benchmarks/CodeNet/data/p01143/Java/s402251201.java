import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int n, m, p;
		while (true) {
			n = sc.nextInt();
			m = sc.nextInt();
			p = sc.nextInt();
			if (n == 0 && m == 0 && p == 0) break;
			int sum = 0, ac = 0, a;
			for (int i = 1; i <= n; i++) {
				a = sc.nextInt();
				if (i == m) ac = a;
				sum +=a; 
			}
			sum = sum*(100-p);
			if (ac == 0) 
				out.println(0);
			else
				out.println(sum/ac);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}