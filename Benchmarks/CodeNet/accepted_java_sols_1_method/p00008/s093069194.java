import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args){
	try{
	    BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
	    int n, count;
	    String ss;
	    while((ss=s.readLine())!=null){
		count=0;
		n=Integer.valueOf(ss);
		for(int a=0; a<10; a++)
		    for(int b=0; b<10; b++)
			for(int c=0; c<10; c++)
			    for(int d=0; d<10; d++)
				if(a+b+c+d==n)
				    count++;
		System.out.println(count);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}