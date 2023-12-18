import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		while(true) {
			int x=Integer.parseInt(in.next()),y=Integer.parseInt(in.next());
			if(x==0 && y==0)break;
			
			if(x<y)out.printf("%d %d\n",x,y);
			else out.printf("%d %d\n", y,x);
		}
		out.flush();
	}

}

