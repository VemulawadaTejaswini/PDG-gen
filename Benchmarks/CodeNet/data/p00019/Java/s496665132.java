import java.io.*;
import java.util.*;
import java.math.*;

class Main{
		
		 public static void factorial(String x){
		 
		 	int count = Integer.valueOf(x).intValue();
		 	String y;
		 	
		 	BigInteger big_a,big_b;
		 	big_a = new BigInteger(x);
		 	
		 	for(int i=count;i>1;i--){
		 		y = Integer.toString(i-1);
		 		big_b = new BigInteger(y);
		 		big_a = big_a.multiply(big_b);
		 	}
		 	
        	System.out.println(big_a);
    	}
		
				
		public static void main(String args[]) throws IOException{
			String str;

			Scanner scan = new Scanner(System.in);
			
			while(scan.hasNext()){
				str = scan.next();
				factorial(str);
			}
		}
}