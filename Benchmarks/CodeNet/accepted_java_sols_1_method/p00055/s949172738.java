import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    String st;
	    while((st=sc.readLine())!=null){
		double s, now, n = Double.valueOf(st);
		s = n; now = n;
		for(int i=2; i<=10; i++){
		    if(i%2==0)
			now *= 2;
		    else
			now /= 3;
		    s+=now;
		}
		System.out.println(s);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}