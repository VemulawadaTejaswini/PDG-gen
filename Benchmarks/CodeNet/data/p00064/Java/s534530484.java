import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try{
	    String st;
	    int sum = 0;
	    while((st = sc.readLine())!=null){
		char c = st.charAt(0);
		String[] p = st.split("\\D+");
		if(c>='0' && (c<='9'))
		    sum += Integer.valueOf(p[0]);
		for(int i=1; i<p.length; i++)
		    sum += Integer.valueOf(p[i]);
	    }
	    System.out.println(sum);
	}catch (Exception e){
	    System.out.println("Error");
	}
    }
}