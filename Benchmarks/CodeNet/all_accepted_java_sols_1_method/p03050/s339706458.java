import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long answer = 0;

		for (long i = 1; i < (long) Math.sqrt(N) + 1; i++) {
			if (N % i == 0) {
				long m1 = i - 1;
				//System.out.println("m1:"+m1);
				if (m1 != 0) {
					if (N / m1 == N % m1) {
						answer += m1;
					}
				}
				if (i != N / i) {
					long m2 = N / i - 1;
					//System.out.println("m2:"+m2);
					if (N / m2 == N % m2) {
						answer += m2;
					}
				}
			}
		}
		sc.close();
		System.out.println(answer);
	}
}