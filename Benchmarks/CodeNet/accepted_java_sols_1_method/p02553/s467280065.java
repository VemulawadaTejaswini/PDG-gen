import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		
	 		StringTokenizer st = new StringTokenizer(bf.readLine());
	 		long a = Integer.parseInt(st.nextToken());
	 		long b = Integer.parseInt(st.nextToken());
	 		long c = Integer.parseInt(st.nextToken());
	 		long d = Integer.parseInt(st.nextToken());
	 	out.println(Math.max(Math.max(a*c, b*d), Math.max(a*d,  b*c)));
 		
 		
 		out.println();
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


