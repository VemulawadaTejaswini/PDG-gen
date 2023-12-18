import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	try{
	    while(true){
		int max=0, maxsofar=0, n = Integer.valueOf(sc.readLine());
		if(n==0)
		    break;
		int[] x = new int[n];
		for(int i=0; i<n; i++)
		    x[i] = Integer.valueOf(sc.readLine());
		for(int i=0; i<n; i++){
		    maxsofar = Math.max(maxsofar+x[i], 0);
		    max = Math.max(max, maxsofar);
		}
		System.out.println(max);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}