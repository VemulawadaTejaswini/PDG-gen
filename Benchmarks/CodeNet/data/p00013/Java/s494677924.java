import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	try{
	    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	    Stack<Integer> s = new Stack<Integer>();
	    String st;
	    int t;
	    while((st=sc.readLine())!=null){
		t = Integer.valueOf(st);
		if(t==0 && !s.empty())
		    System.out.println(s.pop());
		else if(t!=0)
		    s.push(t);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}