import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt(),H[]=new int[n+1];
		for(int i=1;i<=n;i++)H[i]=Integer.parseInt(in.next());
		
		PrintWriter out=new PrintWriter(System.out);
		for(int i=1;i<=n;i++) {
			out.print("node "+i+": ");
			out.print("key = "+H[i]+", ");
			if(i>1)out.print("parent key = "+H[i/2]+", ");
			if(i*2<=n)out.print("left key = "+H[i*2]+", ");
			if(i*2+1<=n)out.print("right key = "+H[i*2+1]+", ");
			out.println();
			out.flush();
		}
	}

}

