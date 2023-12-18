import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    String st;
	    while((st=sc.readLine())!=null){
		int n = Integer.valueOf(st);
		System.out.println(n*(n+1)/2+1);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}