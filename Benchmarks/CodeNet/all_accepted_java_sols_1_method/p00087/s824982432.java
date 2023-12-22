import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	try{
	    String st;
	    while((st=sc.readLine())!=null){
		double a=0, b=0;
		Stack<Double> x = new Stack<Double>();
		String[] p = st.split(" ");
		for(int i=0; i<p.length; i++){
		    if(p[i].equals("-")){
			b = x.pop();
			a = x.pop();
			x.push(a-b);
		    }
		    else if(p[i].equals("+")){
			b = x.pop();
			a = x.pop();
			x.push(a+b);
		    }
		    else if(p[i].equals("*")){
			b = x.pop();
			a = x.pop();
			x.push(a*b);
		    }
		    else if(p[i].equals("/")){
			b = x.pop();
			a = x.pop();
			x.push(a/b);
		    }
		    else
			x.push(Double.valueOf(p[i]));
		}
		System.out.println(x.pop());
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}