import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		long X = Long.valueOf(s.next());
		long K = Long.valueOf(s.next());
		long D = Long.valueOf(s.next());

		if(X < 0) {
			X = X * -1;
		}

		if(X/D >= K) {
			System.out.println(X - K * D);
			return;
		}

		long d = X / D;

		// 奇数
		if(d % 2 == 1) {
			// 奇数
			if(K % 2 == 1) {
				System.out.println(X % D);
				return;
			// 偶数
			}else {
				System.out.println(D - (X % D));
				return;
			}
		}else {
			// 奇数
			if(K % 2 == 1) {
				System.out.println(D - (X % D));
				return;
				// 偶数
			}else {
				System.out.println(X % D);
				return;
			}
		}
	}
}