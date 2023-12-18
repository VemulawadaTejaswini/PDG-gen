import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args){
	try{
	    BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
	    String st;
	    int[] x = new int[1000000];
	    for(int i=2; i<=1000; i++)
		if(x[i]==0)
		    for(int j=i*i; j<1000000; j+=i)
			x[j]=1;
	    while((st=s.readLine())!=null){
		int count=0, n=Integer.valueOf(st);
		for(int i=2; i<=n; i++)
		    if(x[i]==0)
			count++;
		System.out.println(count);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}