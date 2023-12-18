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
	 		
	 	int k = Integer.parseInt(bf.readLine());
 		int count = 0;
 		while(b <= a){
 			b*=2;
 			count++;
 		}
 		while(c <= b){
 			c*=2;
 			count++;
 		}
 		
 		out.println(count<=k ? "Yes" : "No");
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


