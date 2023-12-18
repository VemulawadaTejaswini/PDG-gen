

import java.util.Scanner;



public class Main {

	
	static int max=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//超时过不了
		Scanner scan =new Scanner(System.in);
		StringBuilder builder=new StringBuilder();
		int n=scan.nextInt();
		int[] A=new int[n];
		
		for(int i=0;i<n;i++){
			A[i]=scan.nextInt();
			max=Math.max(max,A[i]);
		}
		int[] B=new int[n];
		int[] C=new int[max+1];
		countSort(A,B,C,n);
		builder.append(B[0]);
		for(int i=1;i<n;i++){
			builder.append(" ").append(B[i]);
		}
		System.out.println(builder);
	}

	private static void countSort(int[] A, int[] B,int[] C, int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++){
			C[A[i]]++;
		}
		
		for(int i=1;i<=max;i++)
			C[i]=C[i-1]+C[i];
		
		
		for(int j=n-1;j>=0;j--){
			B[C[A[j]]-1]=A[j];
			C[A[j]]--;
		}
	}

}

