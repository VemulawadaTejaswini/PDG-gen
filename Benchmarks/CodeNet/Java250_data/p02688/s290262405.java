import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Main {

    public static void main(String[] args) {
    
    	FastScanner scan = new FastScanner();
    	
    	int n = scan.nextInt(), k = scan.nextInt();
    	int [] arr = new int [n];

    	for(int i=0; i<k; i++) {
    		int d = scan.nextInt();
    		for(int j=0; j<d; j++) {
    			int x = scan.nextInt();
    			x--;
    			arr[x] ++;
    		}
    	}
    	int count = 0;
    	for(int i=0; i<arr.length; i++) {
    		if(arr[i] == 0) count++;
    	}
    		System.out.println(count);
    }

   
    static class FastScanner{
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer("");
    	String next() {
    		while(!st.hasMoreTokens())
    			try {
    				st = new StringTokenizer(br.readLine());
    			} catch (IOException e){
    				e.printStackTrace();
    			}
    		return st.nextToken();
    	}
    	
    	int nextInt() {
    		return Integer.parseInt(next());
    	}
    	
    	int [] readArray(int n) {
    		int [] a = new int[n];
    		for(int i=0; i<n ; i++) a[i] = nextInt();
    		return a;
    	}
    	
    	long nextLong() {
    		return Long.parseLong(next());
    	}
    	
    	
    }
    
   
}

