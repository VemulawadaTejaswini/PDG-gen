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
 		ArrayList<BigInteger> array = new ArrayList<BigInteger>();
 		boolean found = false;
 		for(int i = 0;i<n;i++){
 			array.add(new BigInteger(st.nextToken()));
 			if (array.get(i).equals(new BigInteger("0"))){
 				out.println(0);
 				out.close();
 				found = true;
 			}
 		}
 		if (found == false){
	 		BigInteger prod = new BigInteger("1");
	 		
	 		boolean found1 = true;
	 		for(int i = 0;i<n;i++){
	 			prod = prod.multiply(array.get(i));
	 			if (prod.compareTo(new BigInteger("1000000000000000000")) > 0){
	 				out.println(-1);
	 				found1 = false;
	 				break;
	 			}
	 		}
	 		if (found1 == true){
	 			out.println(prod);
	 		}
 		}
 		out.close();
 		
 		
 		
 	}
}
