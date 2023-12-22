import java.util.*;
import java.io.*;
public class Main{
	static final int MOD=998244353;
	public static void main(String[] args) throws IOException{
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		String s=in.readLine();
		if(s.charAt(2)==s.charAt(3)&&s.charAt(4)==s.charAt(5))
			out.append("Yes\n");
		else
			out.append("No\n");
		
		out.flush();
		in.close();
		out.close();
	}
}     
