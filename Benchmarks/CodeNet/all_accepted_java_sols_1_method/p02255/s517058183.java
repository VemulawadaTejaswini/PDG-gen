import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N, a;
		int i, j, k, tmp;
		int[] A = new int[100];
		
		N = sc.nextInt();
		for(i = 0; i < N; i++){
			A[i] = sc.nextInt();
		}
		
		for(k = 0; k < N - 1; k++){
				System.out.print(A[k] + " ");
			}
			System.out.println(A[k]);
		
		for(i = 1; i < N; i++){
			tmp = A[i];
			
			j = i - 1;
			while(j >= 0 && A[j] > tmp){
				A[j + 1] = A[j];
				j --;
			}
			A[j + 1] = tmp;
			
			for(k = 0; k < N - 1; k++){
				System.out.print(A[k] + " ");
			}
			System.out.println(A[k]);
		}
	}
}