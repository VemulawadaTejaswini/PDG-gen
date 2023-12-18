import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long cnt = 0, sum = 0;
		for (long i=0; i<N; i++) {
			long A = sc.nextLong();
			if (A==0) {
				cnt += sum/2;
				sum = 0;
			}
			sum += A;
		}
		cnt += sum/2;
		System.out.println(cnt);
		sc.close();
	}

}
