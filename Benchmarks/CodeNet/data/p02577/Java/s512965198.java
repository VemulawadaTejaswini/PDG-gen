import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		String input = bf.readLine();
 		int sum = 0;
 		for(int j =0 ;j<input.length();j++){
 			sum+=Integer.parseInt(input.charAt(j) + "");
 		}
 		
 		
 		out.println(sum%9 == 0 ? "Yes" : "No");
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


