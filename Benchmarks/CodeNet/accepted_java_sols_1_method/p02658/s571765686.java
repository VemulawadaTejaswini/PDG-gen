import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long ans = 1;
		long prev = 1;
		boolean flag = true;
		boolean zero = false;
		long[] mult = new long[n];
		long check = 1000000000000000000L;
		for(int i = 0; i < n; i++) {
			mult[i] = in.nextLong();
			if(mult[i] == 0L) zero = true;
		}
		if(zero == true) {
			System.out.println("0");
		}else {
			for(int i = 0; i < n; i++) {
				long cur = mult[i];
				if((check / cur) < ans) flag = false;
				ans *= cur;
			}
			if(flag == true) {
				System.out.println(ans);
			}else {
				System.out.println("-1");
			}
		}
	}
}