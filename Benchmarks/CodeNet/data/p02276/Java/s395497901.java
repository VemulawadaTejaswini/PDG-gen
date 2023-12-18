import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] A = new int[n];
		for(int i=0;i<n;i++){
			A[i] = in.nextInt();
		}
		int q = partition(A,0,n-1);
		for(int i = 0;i<n;i++){
			if(i>0)System.out.print(" ");
			if(i==q)System.out.print("[");
			System.out.print(A[i]);
			if(i==q)System.out.print("]");
		}
		System.out.println("");
	}
	
	public static int partition(int[] A,int p,int r){
		int x = A[r];
		int i = p-1;
		for(int j=p;j<r;j++){
			if(A[j]<=x){
				i = i +1;
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}
		int current = A[i+1];
		A[i+1] = A[r];
		A[r] = current;
		return i+1;
	}
}

