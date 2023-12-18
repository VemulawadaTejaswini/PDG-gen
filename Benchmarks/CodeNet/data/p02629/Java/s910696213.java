import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    private static BufferedReader br;
    
	public static void main (String[] args) throws java.lang.Exception {
		br=  new BufferedReader(new InputStreamReader(System.in));
		long num = Long.parseLong(br.readLine());
		
		long res = 0;
		StringBuilder str = new StringBuilder();
		
	    while(num > 0){
	        char x = (char)((num%26) - 1 + 'a');
	        num /= 26;
	        str.append(x);
	    }
	    
	    System.out.println(str.reverse());
	}
}