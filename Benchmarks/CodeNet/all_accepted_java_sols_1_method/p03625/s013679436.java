import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();

			int[] A = new int[N];
			for(int i = 0 ; i < N ; i++){
				A[i] = sc.nextInt();
			}
		sc.close();

		Arrays.sort(A);

		long a = 0;
		long b = 0;
		int count = 0;
		for(int i = N-1 ; i >= 1 ; i--){
			if(A[i] == A[i-1] && count == 0){
				a = A[i];
				count ++;
				if(A[i-1] == A[i-2] && A[i-2] == A[i-3]){
					b = A[i];
					break;
				}
			}
			if(A[i] != a && A[i]==A[i-1] && count == 1){
				b = A[i];
				break;
			}
		}
		long ans = a*b;
		System.out.println(ans);

	}
}
