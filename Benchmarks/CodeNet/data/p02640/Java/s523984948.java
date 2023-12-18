import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		
	 		StringTokenizer st = new StringTokenizer(bf.readLine());
	 		int a = Integer.parseInt(st.nextToken());
	 		int b = Integer.parseInt(st.nextToken());
	 		int d = b-2*a;
	 		if (d%2 == 1 || d <0)
	 		{
	 			
	 			out.println("No");
	 		}else{
	 			int t = d/2;
	 			if (a >= t){
	 				out.println("Yes");
	 			}
	 			else{
	 				out.println("No");
	 			}
	 		}
	 		
	 		
 		
 		
 		
 		out.println();
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


