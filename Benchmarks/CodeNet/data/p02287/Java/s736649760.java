import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=Integer.parseInt(in.next()),H[]=new int[n+1];
		for(int i=1;i<=n;i++)H[i]=Integer.parseInt(in.next());
		
		PrintWriter out=new PrintWriter(System.out);
		for(int i=1;i<=n;i++) {
			out.printf("node %d: key = %d, ", i, H[i]);
			if(i/2>0)out.printf("parent key = %d, ", H[i/2]);
			if(i*2<=n)out.printf("left key = %d, ", H[i*2]);
			if(i*2+1<=n)out.printf("right key = %d, ", H[i/2]);
			out.println();
		}
		out.flush();
	}

}

