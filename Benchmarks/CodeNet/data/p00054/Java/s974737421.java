import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	String st;
	int a, b, n, s;
	try{
	    while((st=sc.readLine())!=null){
		String[] x = st.split(" ");
		a = Integer.valueOf(x[0]);
		b = Integer.valueOf(x[1]);
		n = Integer.valueOf(x[2]);
		s = 0;
		a%=b;
		for(int i=0; i<n; i++){
		    a*=10;
		    s+=(a/b);
		    a%=b;
		}
		System.out.println(s);
	    }
	}catch (Exception e){
	    System.out.println("Error");
	}
    }
}