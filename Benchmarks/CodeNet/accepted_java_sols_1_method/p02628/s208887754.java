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

    	
    	int n = scan.nextInt(); int k = scan.nextInt();
    	
    	int [] price = new int[n];
    	
    	for(int i=0; i<n; i++) {
    		int line = scan.nextInt();
    		price[i] = line;
    	}
    	
    	Arrays.sort(price);
    	int sum = 0;
    	
    	for(int i=0; i<k; i++) {
    		sum+= price[i];
    	}
    	
    	System.out.println(sum);
    	
    } 	
}
