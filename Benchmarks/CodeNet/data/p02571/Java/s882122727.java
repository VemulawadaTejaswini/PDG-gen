import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		String s = bf.readLine().trim();
 		String t = bf.readLine().trim();
 		int min = Integer.MAX_VALUE;
 		for(int j = 0;j<=s.length()-t.length();j++){
 			int count = 0;
 			for(int k = 0;k<t.length();k++){
 				if (t.charAt(k) != s.charAt(j+k))
 					count++;
 			}
 			min = Math.min(count,  min);
 		}
 		
 		
 		out.println(min);
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


