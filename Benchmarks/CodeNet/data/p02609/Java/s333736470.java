import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String X = sc.next();
		int one = 0;
		for(int i = 0; i < N; i++)
			if(X.charAt(i) == '1')
				one++;
		if(one == 1) {
			for(int i = 0; i < N; i++) {
				if(X.charAt(i) == '1')
					System.out.println(0);
				else {
					if(X.charAt(N-1) == '1')
						System.out.println(2);
					else
						System.out.println(1);
				}
			}
			return;
		}
		long[] modmi = new long[N];
		long[] modpl = new long[N];
		modmi[0] = modpl[0] = 1;
		for(int i = 1; i < N; i++) {
			modmi[i] = modmi[i-1] * 2 % (one - 1);
			modpl[i] = modpl[i-1] * 2 % (one + 1);
		}
		long totmi = 0, totpl = 0;
		for(int i = 0; i < N; i++)
			if(X.charAt(i) == '1') {
				totmi += modmi[N-1-i];
				totpl += modpl[N-1-i];
			}
		for(int i = 0; i < N; i++) {
			int ans = 1;
			long t;
			if(X.charAt(i) == '1')
				t = (totmi - modmi[N-1-i] + one - 1) % (one - 1);
			else
				t = (totpl + modpl[N-1-i] + one + 1) % (one + 1);
			while(t > 0) {
				t %= Long.bitCount(t);
				ans++;
			}
			System.out.println(ans);
		}
	}

}