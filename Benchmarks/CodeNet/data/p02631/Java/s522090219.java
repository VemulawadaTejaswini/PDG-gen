import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    
    private static BufferedReader br;
    private static StringTokenizer strz; 
    
	public static void main (String[] args) throws java.lang.Exception {
		br =  new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		strz = new StringTokenizer(br.readLine());
		
		long[] arr = new long[n];
		long xor = 0;
		
		for(int i = 0; i < n; ++i){
		    arr[i] = Long.parseLong(strz.nextToken());
		    xor ^= arr[i];    
		}
		
		for(int i = 0; i < n; ++i){
		    System.out.print((xor^arr[i]) + " ");
		}
	}
}