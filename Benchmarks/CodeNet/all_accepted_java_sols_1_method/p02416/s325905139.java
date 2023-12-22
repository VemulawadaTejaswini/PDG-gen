import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out);
		while(true) {
			String str=in.next(); char[] num=str.toCharArray();
			if(num[0]=='0')break;
			int sum=0;
			for(int i=0;i<num.length;i++)sum+=num[i]-48;
			out.println(sum);
		}
		out.flush();
	}

}

