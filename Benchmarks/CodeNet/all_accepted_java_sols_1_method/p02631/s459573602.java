import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		long x = 0;
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			x ^= A[i];
		}
		for(int i = 0; i < N; i++)
			System.out.print((A[i] ^ x) + " ");
	}

}