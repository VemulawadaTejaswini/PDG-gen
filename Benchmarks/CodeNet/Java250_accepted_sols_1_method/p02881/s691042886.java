import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long cnt = 10000000000000000L;

		for(long i = 1; i * i <= N; i++){
			if(N % i == 0){
				long j = N / i;
				cnt = Math.min(cnt, i + j - 2);
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
