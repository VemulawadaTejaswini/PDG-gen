import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class Main{ 
    
    public static void main(String[] args)throws IOException{
	try{	
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	String line;
	while((line=br.readLine())!=null){
	    int n=Integer.parseInt(line);
	    if(n!=1&&n!=0){
		int cnt=1;
		for(int j=3;j<=n;j++){
		    boolean flag=true;
		    for(int i=2;i*i<=j;i++){
			if(j%i==0){
			    flag=false;
break;
			}
		    }
		    if(flag)
			cnt++;
		}
		System.out.println(cnt);
		
	    }
	    else{
		System.out.println("0");
	    }
	}
	
    }
	catch(java.lang.NumberFormatException e){
	    System.out.println(e);
	}
    }
}