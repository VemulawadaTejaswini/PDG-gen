import java.io.*;
import java.math.BigInteger;

 public class Main{
	 public static void main(String args[]) throws IOException{
		 BufferedReader bf = new BufferedReader(
				 new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		BigInteger result = new BigInteger("1");
		for(int i = n; i > 1 ; i--){
			String str = String.valueOf(i);
			BigInteger I = new BigInteger(str);
			result = result.multiply(I);
		}
		System.out.println(result.toString());
	}
}