import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	class cir {
		int x;
		int y;
		int r;
		int c;

		cir(Scanner sc) {
			this.x = sc.nextInt();
			this.y = sc.nextInt();
			r = sc.nextInt();
			c = sc.nextInt();
		}

		boolean is(cir tar) {
			return (x - tar.x) * (x - tar.x) + (y - tar.y) * (y - tar.y) < (r+tar.r)
					* (r+tar.r);
		}
	}

	void run() {
		for (;;) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			cir[] cc = new cir[n];
			int[] ic = new int[n];
			for (int i = 0; i < n; i++) {
				cc[i] = new cir(sc);

				for (int j = i - 1; j >= 0; j--) {
					if(cc[i].is(cc[j])){
						ic[i] |= 1<<j;
					}
				}
			}
			
			boolean[] dp  = new boolean[1 << n];
			dp[0] = true;
			int res = 0;
			for(int i = 0; i < 1<<n; i++){
				if(!dp[i]){
					continue;
				}
				res = Math.max(Integer.bitCount(i),res);
				for(int bi = 0 ; bi < n; bi++){
					if((~i & ic[bi]) != 0){
						continue;
					}
					if((i & (1<<bi)) != 0){
						continue;
					}
					for(int bi2 = bi+1 ; bi2 < n; bi2++){
						if((~(i | ic[bi]) & ic[bi2]) != 0){
							continue;
						}
						if((i & (1<<bi2)) != 0){
							continue;
						}
						
						if(cc[bi].c != cc[bi2].c){
							continue;
						}
						dp[i |(1<< bi) |(1<< bi2)] = true;
					}
				}				
			}
			System.out.println(res);
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}