
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();


		long[] A = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] =  sc.nextLong();
			if(A[i] == 0) {
				System.out.println(0);
				return;
			} else if (A[i]> 1000000000000000000L) {
				System.out.println(-1);
				return;
			}
		}

		long sum = 1;
		for (int i = 0; i < N; i++) {
			if (((sum * A[i]) % 1000000000000000001L) == 0) {
				sum *= A[i]; 
			} else {
				sum = -1;
				break;
			}
		}

			System.out.println(sum);
		sc.close();
	}
}