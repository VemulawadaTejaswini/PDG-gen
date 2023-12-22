
import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		int v, j;
		int[] A = new int[N];
		
		for(int i = 0; i < N; i++){
			A[i] = scan.nextInt();
		}
		
		for(int k = 0; k < N; k++){
			System.out.print(A[k]);
			if(k < N-1)System.out.print(" ");
		}
		System.out.println();
		
		for(int i = 1; i < N; i++){
			v = A[i];
			j = i - 1;
			
			while(j >= 0 && A[j] > v){
				A[j+1] = A[j];
				j--;
			}
			A[j+1] = v;
			for(int k = 0; k < N; k++){
				System.out.print(A[k]);
				if(k < N-1)System.out.print(" ");
			}
			System.out.println();
		}
	}
}