import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);

	 		String input1 = bf.readLine().trim();
	 		String input2 = bf.readLine().trim();
	 		int count = 0;
	 	for(int i = 0;i<input1.length();i++){
	 		if (input1.charAt(i) != input2.charAt(i))
	 			count++;
	 	}
 		
 		out.println(count);
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


