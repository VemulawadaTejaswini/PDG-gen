import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		StringTokenizer st = new StringTokenizer(bf.readLine());
 		int n = Integer.parseInt(st.nextToken());
 		int m = Integer.parseInt(st.nextToken());
 		int d = Integer.parseInt(st.nextToken());
 		
 		int a = (n+(d-1))/d;
 		int b = (m)/d;
 		out.println(b-a+1);
 		
 		out.println();
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


