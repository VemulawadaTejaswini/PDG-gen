import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long N = in.nextLong();
		long d = divisor(N);
		if (d == 1) {
			System.out.println(N - 1);
		} else {
			long i = d - 1;
			long j = N / d - 1;
			System.out.println(i + j);
		}
		in.close();
	}

	public static long divisor(long n) {
		long max = 0;
		for (long i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				max = Math.max(max, i);
				//n=PQ+0→ PもQも約数. ただし、Q=Pは↑で登録済みなので登録しない
				if (i != n / i)
					max = Math.max(max, i);
			}
		}
		return max;
	}
}