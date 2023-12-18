import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
	try{
	    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	    String st;
	    while((st=sc.readLine())!=null){
		long sum=0, d = Integer.valueOf(st);
		for(int i=1; i<600/d; i++)
		    sum+=d*(i*d)*i*d;
		System.out.println(sum);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}