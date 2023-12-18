import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		long sum = 1;
		long[] A = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] =  sc.nextLong();
			if(A[i] == 0) {
				System.out.println(0);
				return;
			}
		}
		
		for (int i = 0; i < N; i++) {
			if ((sum * sc.nextLong()) % 1000000000000000000L == 0) {
				sum *= sc.nextLong();
			} else {
				sum = -1;
				break;
			}
		}
		
			System.out.println(sum);

		sc.close();
	}
}

