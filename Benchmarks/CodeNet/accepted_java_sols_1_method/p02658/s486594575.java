import java.math.BigDecimal;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long ans = 1;
		long[] A = new long[N];

		for(int i=0; i<N; i++) {
			A[i] = sc.nextLong();
			if(A[i] == 0) {
				System.out.println(0);
				return ;
			}
		}

		for(int i=0; i<N; i++) {
			long a = A[i];
			if(Math.log10(ans) + Math.log10(a) > 18) {
				System.out.println(-1);
				return;
			}
			ans *= a;

		}


		if(ans <= 1000000000000000000l) {
			System.out.println(ans);
		}else {
			System.out.println(-1);
		}

	}
}

