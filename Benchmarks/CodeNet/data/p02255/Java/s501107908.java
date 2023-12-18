import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] A = new int[N];
		for(int i = 0;i<N;i++){
			A[i] = in.nextInt();
		}	
		insertSort(A,N);
	}
	public static void insertSort(int[] A,int N){
		for(int i = 1;i<N;i++){
			int j = i-1;
			int temp = A[i];
			while(j>=0 && temp<A[j]){
				A[j+1] = A[j];
				j--;
				A[j+1] = temp;
			}
			for(int l= 0;l<N;l++){
				if(l>0)System.out.print(" ");
				System.out.print(A[l]);
			}
			if(i<N-1)
			System.out.println("");
		}
	}

}