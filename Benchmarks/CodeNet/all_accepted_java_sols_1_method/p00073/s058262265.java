import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    while(true){
		double x = Integer.valueOf(sc.readLine());
		double h = Integer.valueOf(sc.readLine());
		if(x==0 && h==0)
		    break;
		System.out.println(x*x+2.0*x*Math.sqrt(h*h+(x/2)*(x/2)));
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}