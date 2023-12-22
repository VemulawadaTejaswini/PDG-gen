import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		Integer[] A = new Integer[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();
		if(N<=K) {
			System.out.println(0);
			return;
		}
		Arrays.sort(A,  Collections.reverseOrder());
		long s = 0;
		for(int i=K; i<N; i++) {
				s += A[i];
		}
		System.out.println(s);
	}

}