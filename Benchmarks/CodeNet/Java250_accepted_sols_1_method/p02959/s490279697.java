import java.util.*;
public class Main {
public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		int N  = keyboard.nextInt();
		int[] A = new int[N+1];
		int[] B = new int[N];
		
		for(int i=0; i<N+1; i++) {
			 A[i] = keyboard.nextInt();
		}
		for(int j=0; j<N; j++) {
			 B[j] = keyboard.nextInt();
		}
		
		long count = 0;
		for(int k = N; k>=1; k--) {
			if(A[k] >= B[k-1]) {
				count += B[k-1];
			}else{
				count += A[k];
				if(A[k-1] >= B[k-1]-A[k]) {
					count += B[k-1]-A[k];
					A[k-1] -= B[k-1]-A[k];
				}else{
					count += A[k-1];
					A[k-1] = 0;
				}	
			}
		}
		System.out.println(count);
		keyboard.close();	
	}
}
