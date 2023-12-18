import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		int my=in.nextInt(),debt=in.nextInt(),book=in.nextInt();
		int cred=my-book;
		if(cred<0) {
			if(debt+cred>=0)out.println(Math.abs(cred));
			else out.println("NA");
		}
		else out.println(0);
		out.flush();
	}

}

