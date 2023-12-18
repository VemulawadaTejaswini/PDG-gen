import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args){
	try{
	    BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
	    int count = 0, n = Integer.valueOf(s.readLine());
	    int[] x = new int[n];

	    for(int i=1; i<n; i++)
		if(x[i]==0){
		    count++;
		    for(int j=i; j<n; j+=(i+1))
			x[j]=1;
		}
	    System.out.println(count);
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}