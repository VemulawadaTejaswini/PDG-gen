import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try{
	    while(true){
		String[] xt = sc.readLine().split(" ");
		int a = Integer.valueOf(xt[0]);
		int b = Integer.valueOf(xt[1]);
		if(a==0 && b==0)
		    break;
		boolean flag = false;	
		for(int i=a; i<=b; i++)
		    if(i%4==0){
			if(i%400==0){
			    System.out.println(i);
			    flag = true;
			}
			else if(i%100==0)
			    ;
			else{
			    System.out.println(i);
			    flag = true;
			}
		    }
		if(!flag)
		    System.out.println("NA");
		System.out.println();
	    }
	}catch (Exception e){
	    System.out.println("Error");
	}
    }
}