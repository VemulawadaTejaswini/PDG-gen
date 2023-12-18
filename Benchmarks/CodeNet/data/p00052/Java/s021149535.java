import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	try{
	    int n;
	    while((n = Integer.valueOf(sc.readLine())) != 0){
		int sum=0, fact=5;
		for(int i=1; i<=n && fact<=n; i++){
		    sum+=n/fact;
		    fact*=5;
		}
		System.out.println(sum);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}