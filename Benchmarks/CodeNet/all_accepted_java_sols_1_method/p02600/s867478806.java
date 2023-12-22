import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		int t = Integer.parseInt(bf.readLine());
 		if (t < 600)
 			out.println(8);
 		else if (t < 800)
 			out.println(7);
 		else if (t < 1000)
 			out.println(6);
 		else if (t < 1200)
 	 		out.println(5);
 	 	else if (t < 1400)
 	 		out.println(4);
 	 	else if (t < 1600)
 	 		out.println(3);
 	 	else if (t < 1800)
 	 		out.println(2);
 	 	else if (t < 2000)
 	 		out.println(1);
 		
 		
 		out.println();
	 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


