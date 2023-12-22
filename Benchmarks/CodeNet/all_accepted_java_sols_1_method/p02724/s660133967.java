import java.util.*;
import java.io.*;
public class Main {
	static final int MOD=998244353;
	public static void main(String[] args) throws IOException{
		BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		
		int x=Integer.parseInt(in.readLine());
		
		if(x==0)
			out.append(0+"\n");
		else {
			int happiness=(x/500)*1000;
			x=(x%500);
			happiness+=(x/5)*5;
			out.append(happiness+"\n");
		}
		
		
		out.flush();
		in.close();
		out.close();
	}
}     
