import java.util.*;
import java.math.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception{
		int num = 998244353;

		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);
//	 	
 		int n = Integer.parseInt(bf.readLine());
 		StringTokenizer st = new StringTokenizer(bf.readLine());
 		BigInteger prod = new BigInteger("1");
 		
 		for(int i = 0;i<n;i++){
 			prod = prod.multiply(new BigInteger(st.nextToken()));
 			if (prod.compareTo(new BigInteger("1000000000000000000")) > 0){
 				out.println(-1);
 				out.close();
 				break;
 			}
 		}
 		out.println(prod);
 		
 		out.close();
 		
 		
 		
 	}
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	


