import java.util.*;

public class Algo1{
	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args){
		int N = scan.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++){
			A[i] = scan.nextInt();
		}

		for(int i = 0; i < N; i++){
			if(i != N - 1){
				System.out.printf("%d ", A[i]);
			}else{
				System.out.printf("%d\n", A[i]);
			}
		}

		// ??????????????????
		for(int i = 1; i < N; i++){
			int v = A[i];
			int j = i - 1;
			while(j >= 0 && A[j] > v){
				A[j+1] = A[j];
				j--;
				A[j+1] = v;
			}
			for(int j = 0; j < N; j++){
				if(j != N){
					System.out.printf("%d ", A[j]);
				}else{
					System.out.printf("%d\n", A[j]);
				}
			}
		}
	}
}