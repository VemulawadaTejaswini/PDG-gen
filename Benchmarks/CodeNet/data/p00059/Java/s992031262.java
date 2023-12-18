import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    String st;
	    while((st=sc.readLine())!=null){
		String[] sp = st.split(" ");
		if(Double.valueOf(sp[2]) < Double.valueOf(sp[4]) || Double.valueOf(sp[3]) < Double.valueOf(sp[5]) || Double.valueOf(sp[6]) < Double.valueOf(sp[0]) || Double.valueOf(sp[7]) < Double.valueOf(sp[1])) 
		    System.out.println("NO");
		else
		    System.out.println("YES");
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}