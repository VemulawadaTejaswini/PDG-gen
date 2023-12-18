import java.io.*;
import java.util.*;

class Main{
		
		 public static void factorial(int x){
		 	int count = x;
		 	for(int i=x;i>1;i--){
		 		x = x*(i-1);
		 	}
		 	
        	System.out.println(x);
    	}
		
				
		public static void main(String args[]) throws IOException{
			String str;

			Scanner scan = new Scanner(System.in);
			
			while(scan.hasNext()){
				str = scan.next();
				int x = Integer.valueOf(str).intValue();
				factorial(x);
			}
		}
}