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
    	
    	
    	int n = scan.nextInt();
    	int x = scan.nextInt();
    	int t = scan.nextInt();
    	
    	
    	int time = 0;
    	
    	while (n > 0) {
    		n -= x;
    		time += t;
    	}
    
    	System.out.println(time);
    	
    	
    	
    	
    	}
}
