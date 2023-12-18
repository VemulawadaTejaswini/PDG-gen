import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    String st;
	    LinkedList<Integer> lot = new LinkedList<Integer>();
	    while((st=sc.readLine())!=null){
		int car = Integer.valueOf(st);
		if(car==0)
		    System.out.println(lot.pop());
		else
		    lot.push(car);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}