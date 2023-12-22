import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		String str=in.nextLine(); char[] C=str.toCharArray();
		
		for(int i=0;i<C.length;i++) {
			if(C[i]>=65 && C[i]<=90)C[i]+=32;
			else if(C[i]>=97 && C[i]<=122)C[i]-=32;
			out.print(C[i]);
		}
		out.println();
		out.flush();
	}

}

