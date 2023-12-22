import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    String st;
	    int[] p = new int[101];
	    int max = 0;
	    while((st=sc.readLine())!=null)
		p[Integer.valueOf(st)]++;
	    
	    for(int i=0; i<101; i++)
		if(p[i]>max)
		    max = p[i];
	    for(int i=0; i<101; i++)
		if(p[i] == max)
		    System.out.println(i);
	}
	catch(Exception e){
	    System.out.println("Error");
	}
    }
}