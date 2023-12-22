import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    String st;
	    while((st=sc.readLine())!=null){
		double b = Double.valueOf(st);
		String out;
		if(b<=48.0)
		    out = "light fly";
		else if(b<=51.0)
		    out = "fly";
		else if(b<=54.0)
		    out = "bantam";
		else if(b<=57.0)
		    out = "feather";
		else if(b<=60.0)
		    out = "light";
		else if(b<=64.0)
		    out = "light welter";
		else if(b<=69.0)
		    out = "welter";
		else if(b<=75.0)
		    out = "light middle";
		else if(b<=81.0)
		    out = "middle";
		else if(b<=91.0)
		    out = "light heavy";
		else
		    out = "heavy";
		System.out.println(out);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}