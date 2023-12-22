import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(),L[][]=new int[n+1][n+1];
		
		for(int i=0;i<n;i++) {
			int u=Integer.parseInt(in.next()), k=Integer.parseInt(in.next());
			for(int j=0;j<k;j++) {
				int v=Integer.parseInt(in.next());
				L[u][v]=1;
			}
		}
		
		PrintWriter out=new PrintWriter(System.out);
		for(int i=1;i<=n;i++) {
			for(int j=1;j<n;j++) out.print(L[i][j]+" ");
			out.println(L[i][n]);
		}
		out.flush();
	}

}


