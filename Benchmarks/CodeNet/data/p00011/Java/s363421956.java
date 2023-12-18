import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	try{
	    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	    int[] x = new int[Integer.valueOf(sc.readLine())];
	    int p, a, b, t = Integer.valueOf(sc.readLine());
	    String st, u, v;
	    for(int i=0; i<x.length; i++)
		x[i]=i+1;
	    for(int i=0; i<t; i++){
		String[] parts = sc.readLine().split(",");
		a = Integer.valueOf(parts[0]);
		b = Integer.valueOf(parts[1]);
		p=x[a-1];
		x[a-1]=x[b-1];
		x[b-1]=p;
	    }
	    for(int i=0; i<x.length; i++)
		System.out.println(x[i]);
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}