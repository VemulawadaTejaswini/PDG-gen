import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		int n=in.nextInt(),A[][][]=new int[4][3][10];
		for(int i=0;i<n;i++) {
			int b=Integer.parseInt(in.next()), f=Integer.parseInt(in.next()), r=Integer.parseInt(in.next()), v=Integer.parseInt(in.next());
			A[b-1][f-1][r-1]+=v;
		}
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<10;k++) {
					out.print(" "+A[i][j][k]);
				}
				out.println();
			}
			if(i<3)out.println("####################");
		}
		out.flush();
	}

}

