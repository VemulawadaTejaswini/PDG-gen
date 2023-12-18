
import java.util.Scanner;

public class InsertionSort {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		int N = in.nextInt();
		int[] A = new int[N];
		
		for (int i = 0; i < N; i++) {
			A[i] = in.nextInt();
		}
		
		for (int k : A) {
			System.out.print(k + " ");					
		}
		for (int i = 1; i <= A.length-1; i++) {
			int key = A[i];
			int j = i-1;
			while (j >= 0 && A[j] > key) {
				A[j+1] = A[j];
				j--;
				
				
			}
			A[j+1] = key;
			System.out.print('\n');
			for (int k : A) {
				System.out.print(k + " ");					
			}
			
		}
		
	}
}
