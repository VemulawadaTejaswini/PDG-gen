import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		long K = sc.nextInt();

		long cnt = 0;
		for(long i = 1; i <= K; i++) {
			if((i + i) % K != 0) {
				continue;
			}
			if(i < K) {
				long c = (N+i)/K;
				cnt += c*c*c;
			}else {
				long c = N/K;
				cnt += c*c*c;
			}
		}

		System.out.println(cnt);
		sc.close();
	}

}