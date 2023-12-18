import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String args[]) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	int n=Integer.parseInt(br.readLine());
	int r[]=new int[n];
	int ans=0;
	int max=Integer.MIN_VALUE;
	
	for(int i=0;i<n;i++){
	    r[i]=Integer.parseInt(br.readLine());	  
	}

	int min=r[0];
	
	for(int i=1;i<n;i++){
	    max=Math.max(max,r[i]-min);
	    min=Math.min(min,r[i]);
	}

	
	System.out.println(max);	
    }
}

