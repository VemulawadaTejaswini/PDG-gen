import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		int i=1;
		while(true) {
			int d=Integer.parseInt(in.next());
			if(d==0)break;
			out.printf("Case %d: %d\n", i,d);
			i++;
		}
		out.flush();
	}

}

