import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try{
	    ArrayList<String> st = new ArrayList<String>();
	    String p;
	    while(true){
		p=sc.readLine();
		if(p.equals("0"))
		    break;
		st.add(p);
	    }
	    int i = 0;
	    for(String a:st){
		System.out.println("Case "+(i+1)+": "+a);
		i++;
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}