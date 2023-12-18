import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try{
	    String st;
	    boolean[] prime = new boolean[50100];
	    Arrays.fill(prime, true);
	    prime[0]=false;
	    prime[1]=false;
	    for(int i=0; i<Math.sqrt(50100); i++)
		if(prime[i])
		    for(int j=i*i; j<50100; j+=i)
			prime[j]=false;
	    
	    while((st=sc.readLine())!=null){
		int n = Integer.valueOf(st);
		for(int i=n-1; i>0 ;i--)
		    if(prime[i]){
			System.out.print(i+" ");
			break;
		    }
		for(int i=n+1; i<50100; i++)
		    if(prime[i]){
			System.out.println(i);
			break;
		    }
	    }
    	}catch (Exception e){
	    System.out.println("Error");
	}
    }
}