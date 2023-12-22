import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		int r=in.nextInt(),c=in.nextInt(),M[][]=new int[r+1][c+1];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				int n=Integer.parseInt(in.next());
				M[i][j]=n; M[i][c]+=n; M[r][j]+=n; M[r][c]+=n;
			}
		}
		
		for(int i=0;i<=r;i++) {
			for(int j=0;j<c;j++)out.print(M[i][j]+" ");
			out.println(M[i][c]);
		}
		out.flush();
	}

}

