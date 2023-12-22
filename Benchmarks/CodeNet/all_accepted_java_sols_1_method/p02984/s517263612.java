
import java.util.Scanner;
public class Main {
	static int mod = 1000000007;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] A =new long[n];
		long sum = 0;
		for(int i = 0; i < n; i++) {
			A[i] = sc.nextLong();
			sum += A[i];
		}
		long[] b = new long[n];
		b[0] = sum;
		for(int i = 1; i < n-1; i+=2) {
			b[0] -= 2*A[i];
		}
		for(int i = 1; i < n; i++) {
			b[i] = 2*A[i-1] - b[i-1];
		}
		for(int i = 0; i < n; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		//System.out.println(ans);
		sc.close();

	}
}
