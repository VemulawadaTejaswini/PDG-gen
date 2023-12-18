import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Q = sc.nextInt();
		int N = 100_001;
		boolean[] prime = new boolean[N+1];
		Arrays.fill(prime, true);
		prime[0] = prime[1] = false;
		for(int x = 4; x <= N; x+=2)
			prime[x] = false;
		for(int i = 3; i <= Math.sqrt(N); i+=2)
			if(prime[i])
				for(int x = i * 2; x <= N; x+=i)
					prime[x] = false;
		int[] S = new int[N];
		for(int i = 1; i < N; i++) {
			S[i] = S[i-1];
			if(i % 2 != 0 && prime[i] && prime[(i+1)/2])
				S[i]++;
		}
		for(int q = 0; q < Q; q++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			System.out.println(S[r] - S[l-1]);
		}
	}

}