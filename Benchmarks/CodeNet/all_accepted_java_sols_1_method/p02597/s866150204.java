import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		int t = Integer.parseInt(bf.readLine());
 		String input = bf.readLine().trim();
 		int wcount = 0;
 		for(int i = 0;i<t;i++)
 			if (input.charAt(i) == 'W')
 				wcount++;
 		int ans = 0;
 		for(int j = t-wcount;j<t;j++)
 			if (input.charAt(j) == 'R')
 				ans++;
 		
 		
 		
 		
 		out.println(ans);
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


