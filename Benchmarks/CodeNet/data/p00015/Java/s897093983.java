import java.io.*;
import java.util.*;
import java.math.*;

class Main{
		
		public static void main(String args[]) throws IOException{
			ArrayList<String> inp = new ArrayList<String>();
			
			Scanner scan = new Scanner(System.in);
			String str1 = scan.next();
			
			BigInteger big_ch = new BigInteger("100000000000000000000000000000000000000000000000000000000000000000000000000000000");
			BigInteger big_inp,big_ch2;
			String str_c;

			int n = Integer.valueOf(str1).intValue();
			
			while(scan.hasNext()){
				str1 = scan.next();
				big_inp = new BigInteger(str1);
				big_ch2 = big_ch.subtract(big_inp);
				str_c = big_ch2.toString();
				if(str_c.charAt(0) == '-' || str_c == "0") System.out.println("overflow");
				else inp.add(str1);
			}

			BigInteger big_sum;
			for(int i=0;i<inp.size()/n;i++){
				big_sum = new BigInteger("0");
				for(int j=0;j<n;j++){
					big_inp = new BigInteger(inp.get(i*n+j));
					big_sum = big_sum.add(big_inp);
				}
				big_ch2 = big_ch.subtract(big_sum);
				str_c = big_ch2.toString();
				
				if(str_c.charAt(0) != '-')
					System.out.println(big_sum);
				else if(str_c == "0")System.out.println("overflow");
				else System.out.println("overflow");
			}
	}
}