import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    while(true){
		int n = Integer.valueOf(sc.readLine()), sum = 0;
		if(n==0)
		    break;
		for(int i=0; i<n/4; i++)
		    sum+=Integer.valueOf(sc.readLine());
		System.out.println(sum);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}