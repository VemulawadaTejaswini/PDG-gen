import java.io.*;
import java.util.*;
class Main
{
	public static void main(String[] ar)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		if(n%k==0)
			out.println(0);
		else
			out.println(1);
		out.flush();		
	}
}
/**

**/