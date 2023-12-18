import java.io.*;
import java.util.*;

public class Main {
	static int H=0;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A[]=new int[2000001];
		
		for(int i=0;i<2000001;i++)A[i]=-1;
		
		PrintWriter out=new PrintWriter(System.out);
		while(true) {
			String odr = in.next();
			if(odr.equals("end"))break;
			else if(odr.equals("insert")) {
				int k=Integer.parseInt(in.next());
				A[H+1]=k;
				H++;
				buildMaxHeap(A);
			}
			else if(odr.equals("extract")) {
				out.println(A[1]);
				A[1]=-1;
				buildMaxHeap(A);
				H--;
			}
		}
		out.flush();
	}
	
	static void maxHeapify(int A[],int index) {
		int l=index*2, r=index*2+1, L;
		
		if(l<=H && A[l]>A[index])L=l;
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
		for(int i=H/2;i>0;i--)maxHeapify(A,i);
	}

}

