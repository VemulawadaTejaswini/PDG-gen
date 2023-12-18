import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		int n=Integer.parseInt(in.next()),A[]=new int[n];
		for(int i=0;i<n;i++) A[i]=Integer.parseInt(in.next());
		
		int q=Integer.parseInt(in.next());
		for(int i=0;i<q;i++) {
			int com=Integer.parseInt(in.next()),
					b=Integer.parseInt(in.next()),
					e=Integer.parseInt(in.next());
			
			if(com==0) {
				int min=A[b];
				for(int j=b+1;j<e;j++) {
					if(A[j]<min)min=A[j];
				}
				out.println(min);
			}
			else {
				int max=A[b];
				for(int j=b+1;j<e;j++) {
					if(A[j]>max)max=A[j];
				}
				out.println(max);
			}
		}
		out.flush();
	}

}
