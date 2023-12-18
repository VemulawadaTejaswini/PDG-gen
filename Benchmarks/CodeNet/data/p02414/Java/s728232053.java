import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		int n=in.nextInt(),m=in.nextInt(),l=in.nextInt();
		int A[][]=new int[n][m],B[][]=new int[m][l],C[][]=new int[n][l];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				A[i][j]=Integer.parseInt(in.next());
			}
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<l;j++) {
				B[i][j]=Integer.parseInt(in.next());
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<l;j++) {
				for(int k=0;k<m;k++) {
					C[i][j]+=A[i][k]*B[k][j];
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<l-1;j++) {
				out.print(C[i][j]+" ");
			}
			out.println(C[i][l-1]);
		}
		out.flush();
	}

}

