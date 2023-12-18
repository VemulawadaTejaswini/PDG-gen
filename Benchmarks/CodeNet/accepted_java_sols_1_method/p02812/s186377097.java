import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		int len = Integer.parseInt(bf.readLine());
 		String s = bf.readLine().trim();
 		int count =0 ;
 		for(int i = 0;i<s.length()-2;i++){
 			if (s.charAt(i) == 'A' && s.charAt(i+1) == 'B' && s.charAt(i+2) == 'C')
 				count++;
 		}
 		out.println(count);
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


