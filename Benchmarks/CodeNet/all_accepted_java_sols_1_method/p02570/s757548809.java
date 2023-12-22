import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		
//	 		String input1 = bf.readLine().trim();
//	 		String input2 = bf.readLine().trim();
	 		StringTokenizer st = new StringTokenizer(bf.readLine());
	 		int d = Integer.parseInt(st.nextToken());
	 		int s = Integer.parseInt(st.nextToken());
	 		int t = Integer.parseInt(st.nextToken());
 		
 		
 		out.println((d+0.0)/(s+0.0)<=t ? "Yes" : "No");
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


