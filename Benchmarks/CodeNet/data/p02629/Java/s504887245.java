import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {


    public static void main(String[] args) throws IOException {
    
    	Scanner scan = new Scanner(System.in);
    	
    	long n = scan.nextInt();

    	String ans = "";
    	
    	
    	while(n > 0) {
    		long k = n/ 26;
    		int z = (int) (n % 26);
    		
    		if(z == 0) {
    			k--;
    			ans += (char)('z');
    		} else {
    			ans += (char)('a'+z-1);
    		}
    		n = k;
    		
    	}
    	System.out.println(ans);
    
    }
}

