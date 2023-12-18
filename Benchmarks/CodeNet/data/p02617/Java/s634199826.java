import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		int n = Integer.parseInt(bf.readLine());
 		long sum = 0;
 		for(int i =1;i<=n;i++){
 			sum+= i*(n-i+1);
 		}
 		for(int i = 0;i<n-1;i++){
//	 		String input1 = bf.readLine().trim();
//	 		String input2 = bf.readLine().trim();
	 		StringTokenizer st = new StringTokenizer(bf.readLine());
	 		int v1 = Integer.parseInt(st.nextToken());
	 		int v2 = Integer.parseInt(st.nextToken());
	 		int min = Math.min(v1, v2);
	 		int max = Math.max(v1,  v2);
	 		sum-=min*(n-max+1);
 		}
 		
 		
 		out.println(sum);
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


