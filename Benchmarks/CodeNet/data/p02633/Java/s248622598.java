import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
 		int t = Integer.parseInt(bf.readLine());
 		int a = 180-t;
 		for(int j = 360;;j+=360){
 			if (j%a == 0){
 				out.println(j/a);
 				break;
 			}
 			
 		}
 		out.println();
 		out.close();
	 		
 		
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


