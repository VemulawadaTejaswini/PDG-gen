import java.util.*;
import java.io.*;

public class Main {
	static int n, H[];
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n=Integer.parseInt(in.next()); H=new int[n+1];
		for(int i=1;i<=n;i++) {
			H[i]=Integer.parseInt(in.next());
		}
		buildMaxHeap();
		
		PrintWriter out=new PrintWriter(System.out);
		for(int i=1;i<=n;i++)out.print(" "+H[i]);
		out.println();
		out.flush();
	}
	
	static void maxheapify(int i) {
		if(i*2>n) return;
		
		int max=H[i], u=-1;
		if(H[i*2]>max) {
			max=H[i*2];
			u=i*2;
		}
		if(i*2+1<=n && H[i*2+1]>max) {
			max=H[i*2+1];
			u=i*2+1;
		}
		
		if(u>0) {
			int t=H[i];
			H[i]=H[u];
			H[u]=t;
			maxheapify(u);
		}
	}
	
	static void buildMaxHeap() {
		for(int i=n/2;i>0;i--)maxheapify(i);
	}
}


