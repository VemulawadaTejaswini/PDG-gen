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
			int b=Integer.parseInt(in.next()),
					e=Integer.parseInt(in.next()),
					k=Integer.parseInt(in.next());
			int cnt=0;
			for(int j=b;j<e;j++) {
				if(A[j]==k)cnt++;
			}
			out.println(cnt);
		}
		out.flush();
	}

}
