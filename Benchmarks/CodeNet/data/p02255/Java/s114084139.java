import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int[] A = new int[n];
		for(int i = 0; i < n; i++){
			A[i] = scan.nextInt();
		}
		Print(A, n);
		Sort(A, n);
		
	}
	
	public static void Print(int A[], int n){
		for(int i = 0; i < n; i++){
			if(i > 0){
				System.out.print(" ");
				
			}
			System.out.print(A[i]);
		}
		System.out.println();
	}
	
	public static void Sort(int A[], int n){
		int v = 0;
		int j = 0;
		for(int i = 1; i < n; i++){
			v = A[i];
			j = i -1;
			while(j >= 0 && A[j] > v){
				A[j + 1] = A[j];
				j--;
			}
			A[j + 1] = v;
			Print(A,n);
		}
	}

}