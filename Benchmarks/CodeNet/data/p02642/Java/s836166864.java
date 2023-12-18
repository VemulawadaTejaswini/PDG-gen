import java.util.Arrays;
import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		Integer[] A = new Integer[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}

		int ans = 0;
		Arrays.sort(A);
		boolean[] judges = new boolean[N];
		Arrays.fill(judges, true);
		for(int i=0; i<N; i++) {

//			if(!judges[i]) {
//				if(i+1 < N && A[i+1] == A[i]) {
//					judges[i+1] = false;
//					System.out.println((i+1) + ": " + judges[i+1]);
//				}
//				continue;
//			}

			if(isPrime(A[i])) {
				if(i+1 < N && A[i+1] == A[i]) {
					judges[i] = false;
					judges[i+1] = false;
				}
			}else {
				for(int j=0; j<Math.min(i+2, N); j++) {
					if(i == j)
						continue;

					if(A[i] % A[j] == 0) {
//						System.out.println(A[i] + "%" + A[j]);
						judges[i] = false;
						break;
					}
				}
			}

//			System.out.println("judges: " + judges[i]);
			if(judges[i]) {
//				System.out.println("i=" + i);
				ans++;
			}
		}

		System.out.println(ans);
	}

	//高速な素数判定(O(√n))
	public static boolean isPrime(int n) {
		if(n < 2)
			return false;
		if(n == 2)
			return true;
		if(n % 2 == 0)
			return false;

		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n % i == 0)
				return false;
		}

		return true;
	}
}
