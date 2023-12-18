import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	public static void main (String[] args) throws java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
	    while(line!=null){
	        String[] lines = line.split(" ");
    	    long a = Integer.parseInt(lines[0]);
    	    long b = Integer.parseInt(lines[1]);
    	    long tmp_a = a;
    	    long tmp_b = b;
    	    
    	    if(a<b){
    	        long tmp = a;
    	        a = b;
    	        b = tmp;
    	    }
    	    long r=a%b;
    	    while(r!=0){
    	        a=b;
    	        b=r;
    	        r=a%b;
    	    }
    	    long GCD = b;
    	    System.out.print(GCD);
    	    System.out.print(" ");
    	    System.out.println((tmp_a*tmp_b)/GCD);
	        line = br.readLine();
	    }
	}
}