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
		double d = (double)a/b;
		int p = (int)(Math.pow(10, n)*d);
		s = 0;
		for(int i=0; i<n; i++){
		    s+=p%10;
		    p/=10;
		}
		System.out.println(s);
	    }
	}catch (Exception e){
	    System.out.println("Error");
	}
    }
}