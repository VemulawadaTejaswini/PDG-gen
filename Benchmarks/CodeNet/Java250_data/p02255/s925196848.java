import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(), A[]=new int[n];
		for(int i=0;i<n;i++)A[i]=in.nextInt();
		trace(A);
		insertSort(A);
	}
	
	static void insertSort(int[] A) {
		for(int i=1;i<A.length;i++) {
			int v=A[i], j=i-1;
			while(j>=0 && A[j]>v) {
				A[j+1]=A[j];
				j--;
			}
			A[j+1]=v;
			trace(A);
		}
		
	}
	
	static void trace(int[] A) {
		for(int i=0;i<A.length-1;i++)System.out.print(A[i]+" ");
		System.out.println(A[A.length-1]);
	}

}

