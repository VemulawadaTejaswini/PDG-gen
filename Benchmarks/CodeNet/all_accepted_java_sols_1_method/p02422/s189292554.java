import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		String str=in.next();int q=in.nextInt();
		char[] C=str.toCharArray();
		
		for(int i=0;i<q;i++) {
			String odr=in.next();
			if(odr.equals("print")) {
				int s=in.nextInt(),e=in.nextInt();
				for(int j=s;j<=e;j++)out.print(C[j]);
				out.println();
			}
			else if(odr.equals("reverse")) {
				int s=in.nextInt(),e=in.nextInt();
				char[] rev=new char[e-s+1];
				for(int j=0;j<=e-s;j++)rev[j]=C[e-j];
				for(int j=0;j<=e-s;j++)C[s+j]=rev[j];
			}
			else if(odr.equals("replace")) {
				int s=in.nextInt(),e=in.nextInt();
				char[] rep=in.next().toCharArray();
				for(int j=0;j<=e-s;j++)C[s+j]=rep[j];
			}
		}
		out.flush();
	}

}

