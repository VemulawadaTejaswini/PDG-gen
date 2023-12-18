import java.util.*;
import java.io.*;

public class Main {
	
	static int H;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		H=in.nextInt();
		int A[]=new int[H+1];
		
		for(int i=1;i<=H;i++) {
			int k=Integer.parseInt(in.next());
			A[i]=k;
		}
		
		buildMaxHeap(A);
		
		PrintWriter out=new PrintWriter(System.out);
		for(int i=1;i<H;i++)out.print(A[i]+" ");
		out.println(A[H]);
		out.flush();
		
	}
	
	static void maxHeapify(int A[],int index) {
		int l=index*2, r=index*2+1, L;
		
		if(l<=H && A[l]>A[index]) L=l;
		else L=index;
		if(r<=H && A[r]>A[L])L=r;
		
		if(L!=index) {
			int t=A[index];
			A[index]=A[L];
			A[L]=t;
			
			maxHeapify(A,L);
		}
	}
	
	static void buildMaxHeap(int A[]) {
		for(int i=H/2;i>0;i--) {
			maxHeapify(A,i);
		}
	}
}

