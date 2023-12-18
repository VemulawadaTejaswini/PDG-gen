import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	public static void main (String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String line = br.readLine();
	    while(line!=null){
    	    int n = Integer.parseInt(line);
    	    int ans = 0;
    	    for(int i=0;i<=9;i++)
    	    for(int j=0;j<=9;j++)
    	    for(int k=0;k<=9;k++)
    	    for(int l=0;l<=9;l++)
    	    if(n==i+j+k+l)  ans++;
    	    
    		System.out.println(ans);
	        line = br.readLine();
	    }
	}
}