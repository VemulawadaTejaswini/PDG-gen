import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    private static BufferedReader br;
    
	public static void main (String[] args) throws java.lang.Exception {
		br=  new BufferedReader(new InputStreamReader(System.in));
		long num = Long.parseLong(br.readLine());
		
		StringBuilder str = new StringBuilder();
		
	    while(num > 0){
	        int rem = (int)(num%26L);
	        if(rem == 0){
	            str.append('z');
	            num = num/26 -1;
	        }else{
	            char x = (char)(rem - 1 + 'a');
	            str.append(x);
	            num /= 26;
	        }
	    }
	    
	    System.out.println(str.reverse());
	}
}