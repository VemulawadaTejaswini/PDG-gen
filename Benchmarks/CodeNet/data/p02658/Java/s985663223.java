import java.util.*;
 
public class Main {
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long ans = 1;
		boolean key = false;
		boolean zero = false;
		for (int i = 0; i < N; i++) {
			long Ai = sc.nextLong();
			if (Ai == 0) {
				zero = true;
			}
			ans *= Ai;
			if (1000000000000000000L < ans) {
				key = true;
			}
		}
		if (key && !zero) {
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}
	}
}