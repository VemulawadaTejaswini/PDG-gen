import java.io.*;
import java.util.*;
import java.lang.Math.*;

public class Main{ 
    
    public static void main(String[] args)throws IOException{
	try{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	String line;
	int n = Integer.parseInt(br.readLine());
	
	for(int i=0;i<n;i++){
	    line=br.readLine();
	    StringTokenizer st=new StringTokenizer(line);
	    int b=0,c=0,x=0;
	    boolean flag=true;
	    while(st.hasMoreTokens()){
		
		if((x=Integer.parseInt(st.nextToken()))>b)
		    b=x;
		else if(x>c)
		    c=x;
		else
		    flag=false;
	    }
	    if(flag)
		System.out.println("YES");
	    else
		System.out.println("NO");
	}
	}catch(java.lang.NumberFormatException e){
	    System.out.println(e);
	}
    }
}