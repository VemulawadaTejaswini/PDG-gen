import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		StringTokenizer st = new StringTokenizer(bf.readLine());
 		int h1 = Integer.parseInt(st.nextToken());
 		int m1 = Integer.parseInt(st.nextToken());
 		int h2 = Integer.parseInt(st.nextToken());
 		int m2 = Integer.parseInt(st.nextToken());
 		int k = Integer.parseInt(st.nextToken());
 		
 		int l = h2*60+m2-(h1*60+m1);
 		out.println(l-k);
 		out.close();
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


