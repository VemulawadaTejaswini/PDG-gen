import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		int n=in.nextInt(),vec[][]=new int[2][n];
		for(int i=0;i<2;i++) {
			for(int j=0;j<n;j++) vec[i][j]=Integer.parseInt(in.next());
		}
		
		double D=0;
		for(int i=0;i<n;i++)D+=Math.abs(vec[0][i]-vec[1][i]);
		out.printf("%f\n",D);
		
		D=0;
		for(int i=0;i<n;i++)D+=Math.pow(vec[0][i]-vec[1][i], 2);
		out.printf("%f\n",Math.sqrt(D));
		
		D=0;
		for(int i=0;i<n;i++)D+=Math.pow(vec[0][i]-vec[1][i],3);
		out.printf("%f\n",Math.cbrt(D));
		
		D=Math.abs(vec[0][0]-vec[1][0]);
		for(int i=1;i<n;i++)D=Math.max(D, Math.abs(vec[0][i]-vec[1][i]));
		out.printf("%f\n", D);
		out.flush();
	}
}
