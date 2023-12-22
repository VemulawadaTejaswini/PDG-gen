import java.math.BigDecimal;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		BigDecimal ans = new BigDecimal(1);
		BigDecimal over = new BigDecimal(1000000000000000000L);
		boolean ov = false;
		boolean ze = false;
		for (int i = 0; i < N; i++) {
			long Ai = sc.nextLong();
			if (!ze) {
				if (Ai == 0) {
					ze = true;
				}
				if (!ov) {
					BigDecimal bd = new BigDecimal(Ai);
					ans = ans.multiply(bd);
					int ju = ans.compareTo(over);
					if (ju == 1) {
						ov = true;
					}
				}
			}
		}
		if (ze) {
			System.out.println(0);
		} else if (ov) {
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}
	}
}