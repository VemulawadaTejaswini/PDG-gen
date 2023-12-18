import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args){
	try{
	    BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
	    int x = 100000, n = Integer.valueOf(s.readLine());
	    for(int i=0; i<n; i++){
		x+=0.05*x;
		if(x%1000!=0)
		    x=1000*(x/1000+1);
	    }
	    System.out.println(x);
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}