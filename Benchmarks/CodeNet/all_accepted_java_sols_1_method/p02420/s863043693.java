import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		while(true) {
			String str=in.next();
			if(str.equals("-"))break;
			int m=in.nextInt();
			
			for(int i=0;i<m;i++) {
				int h=Integer.parseInt(in.next());
				String str1=str.substring(0, h),str2=str.substring(h);
				//out.println(str1+" "+str2);
				str=str2+str1;
			}
			out.println(str);
		}
		out.flush();
	}

}

