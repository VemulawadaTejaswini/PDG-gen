import java.io.*;
import java.util.*;
import java.math.*;

class Main{
		
		public static void main(String args[]) throws IOException{
			ArrayList<String> inp = new ArrayList<String>();
			ArrayList<String> buf = new ArrayList<String>();
			
			Scanner scan = new Scanner(System.in);
			String str1 = scan.next();
			
			BigInteger big_ch = new BigInteger("100000000000000000000000000000000000000000000000000000000000000000000000000000000");
			BigInteger big_inp,big_ch2;
			String str_c;
			boolean ch = true;

			int n = Integer.valueOf(str1).intValue();
			
			while(scan.hasNext()){
				for(int i=0;i<n;i++){
					str1 = scan.next();
					buf.add(str1);
				}
				for(int j=0;j<n;j++){
					big_inp = new BigInteger(buf.get(j));
					big_ch2 = big_ch.subtract(big_inp);
					str_c = big_ch2.toString();
					if(str_c.charAt(0) == '-' ){System.out.println("overflow"); ch =false; break;}
					else if(str_c == "0"){ System.out.println("overflow"); ch =false; break;}
				}
					if(ch == true){
						for(int k=0;k<n;k++){
							inp.add(buf.get(k));
						}
					}
				ch = true;
				buf.clear();
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

				if(str_c == "0")System.out.println("overflow");
				else if (str_c.charAt(0) == '-')System.out.println("overflow");
				else System.out.println(big_sum);
			}
	}
}