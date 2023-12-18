import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		
		int n=cin.nextInt(),A[]=new int[n];
		for(int i=0;i<n;i++) {
			A[i]=Integer.parseInt(cin.next());
		}
		
		int B[]=countingSort(A);
		
		PrintWriter out=new PrintWriter(System.out);
		for(int i=0;i<B.length-1;i++) {
			out.print(B[i]+" ");
		}
		out.println(B[B.length-1]);
		out.flush();
	}
	
	static int[] countingSort(int A[]) {
		
		int m=-1,size=A.length;
		for(int i=0;i<size;i++) {
			m=Math.max(m, A[i]);
		}
		
		int C[]=new int[m+1];
		for(int i=0;i<size;i++) {
			C[A[i]]++;
		}
		
		for(int i=1;i<m+1;i++) {
			C[i]+=C[i-1];
		}
		
		int B[]=new int[size];
		for(int i=size-1;i>=0;i--) {
			int v=A[i];
			B[C[v]-1]=v;
			C[v]--;
		}
		
		return B;
	}

}

