import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class Main{ 
    
    public static void main(String[] args)throws IOException{
	try{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	String line;
	while((line=br.readLine())!=null){
	    int n = Integer.parseInt(line);
	    int x=1;
	    boolean flag = true;
	    while(n!=0){
		if(n%2==1){
		    if(flag){
		    System.out.print(x);
		    flag=false;
		    }
		    else{
			System.out.print(" "+x);
		    }
		}
		n/=2;x*=2;
		
		
	    }
	    System.out.println();
	}
	}catch(java.lang.NumberFormatException e){
	    System.out.println(e);
	}
    }
}