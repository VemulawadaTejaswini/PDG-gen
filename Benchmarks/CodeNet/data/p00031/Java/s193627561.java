import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    String st, sp;
	    while((st=sc.readLine())!=null){
		st = Integer.toBinaryString(Integer.valueOf(st));
		int m=1;
		for(int i=st.length()-1; i>=1; i--){
		    if(st.charAt(i)=='1'){
			System.out.printf(m+" ");
			m*=2;
		    }
		    else
			m*=2;
		}
		System.out.println(m);
	    }
	}
	catch(Exception e){
	    System.out.println("Error");
	}
    }
}