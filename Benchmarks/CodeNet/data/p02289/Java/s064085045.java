import java.io.*;
import java.util.*;

public class Main {
	static int H=0;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		int A[]=new int[2000001];
		
		for(int i=0;i<2000001;i++)A[i]=-1;
		
		PrintWriter out=new PrintWriter(System.out);
		while(true) {
			//String odr = in.next();
			String str="";
			try {
				str=buffer.readLine();
			}catch(IOException e) {
				e.printStackTrace();
			}
			String odr[]=str.split(" ",0);
			if(odr[0].equals("end"))break;
			else if(odr[0].equals("insert")) {
				int k=Integer.parseInt(odr[1]);
				insKey(A,k);
			}
			else if(odr[0].equals("extract")) {
				//buildMaxHeap(A);
				out.println(A[1]);
				delTop(A);
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
	
	static void delTop(int A[]) {
		A[1]=A[H];
		H--;
		maxHeapify(A,1);
	}
	
	static void insKey(int A[],int k) {
		H++;
		A[H]=k;
		int i=H;
		while(i>1 && A[i]>A[i/2]) {
			int t=A[i/2];
			A[i/2]=A[i];
			A[i]=t;
			i=i/2;
		}
	}

}

