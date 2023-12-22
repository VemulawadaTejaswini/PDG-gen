
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		int maxv = 0;
		int maxi = 0;
		for(int i = 0; i< N; i++) {
			A[i] = sc.nextInt();
			if(maxv < A[i]) {
				maxv = A[i];
				maxi = i;
			}
		}
		Arrays.sort(A);
		if(A[N -2] == A[N - 1]){
			for(int i = 0; i < N; i++) {
				System.out.println(A[N - 1]);
			}
		}else {
			for(int i = 0; i < N; i++) {
				if(i == maxi) {
					System.out.println(A[N - 2]);
				}else {
					System.out.println(A[N - 1]);
				}
			}
		}

	}

}
