import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    private static BufferedReader br;
    private static StringTokenizer strz;
    
	public static void main (String[] args) throws java.lang.Exception {
		br=  new BufferedReader(new InputStreamReader(System.in));
		strz = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(strz.nextToken());
		int k = Integer.parseInt(strz.nextToken());
		
		int[] arr = new int[n];
		
		strz = new StringTokenizer(br.readLine());
		for(int i= 0; i < n; ++i)
		    arr[i] = Integer.parseInt(strz.nextToken());
		    
		Arrays.sort(arr);
		    
		int cost = 0;
		for(int i = 0; i < k; ++i)
		    cost += arr[i];
		System.out.println(cost);
	}
}
