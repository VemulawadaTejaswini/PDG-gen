import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		int t = Integer.parseInt(bf.readLine());
 		if (t%2 == 0 || t%5 == 0)
 			out.println(-1);
 		else{
 			long prod = 1;
 			
 			long sum = 0;
 			int i = 1;
 			for(i = 1;i<=1000000;i++){
 				sum+=(7*prod)%t;
 				sum%= t;
 				if (sum%t == 0)
 					break;
 				prod = prod*10;
 				prod%=t;
 			}
 			
 			out.println(i);
 		}
 		
 		
 		out.println();
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


