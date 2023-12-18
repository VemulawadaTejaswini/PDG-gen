import java.util.*;
import static java.lang.System.*;

public class Main {

	/**
	 * @param args
	 */
	Scanner sc = new Scanner(in);
	
	void run() {
		int n = sc.nextInt();
		int y, m, d;
		int ans;
		int count;
		for (int i = 0; i < n; i++) {
			y = sc.nextInt();
			m = sc.nextInt();
			d = sc.nextInt();
			count = 0;
			for (int j = y+1; j < 1000; j++)
				if (j % 3 == 0)
					count++;
			ans = 195*(1000-y-1) + 5*count;
			
			if (y % 3 == 0){
				ans += 20*(10-m)+20-d;
			} else {
				count = 0;
				for (int j = m; j <= 10; j++)
					if (j % 2 == 0)
						count++;
				ans += 20*(10-m+1)-count;
				
				ans -= d;
				
			}
			
			out.println(ans+1);
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().run();
	}

}