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
	 		int c = Integer.parseInt(st.nextToken());
	 		int d = Integer.parseInt(st.nextToken());
	 		int e = Integer.parseInt(st.nextToken());
	 		
 		if (a == 0){
 			out.println(1);
 		}
 		else if (b == 0){
 			out.println(2);
 		}
 		else if (c == 0){
 			out.println(3);
 		}
 		else if (d == 0){
 			out.println(4);
 		}
 		else if (e == 0){
 			out.println(5);
 		}
 		
 		
 		out.println();
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


