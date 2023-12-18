import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		while(true) {
			int a=in.nextInt();
			String op=in.next();
			if(op.equals("?"))break;
			
			if(op.equals("+")) {
				out.println(a+in.nextInt());
			}
			else if(op.equals("-"))out.println(a-in.nextInt());
			else if(op.equals("*"))out.println(a*in.nextInt());
			else if(op.equals("/"))out.println(a/in.nextInt());
		}
		out.flush();
	}

}

