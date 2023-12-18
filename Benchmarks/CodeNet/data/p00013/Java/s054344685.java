import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	try{
	    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	    Stack<Integer> s = new Stack<Integer>();
	    ArrayList<Integer> x = new ArrayList<Integer>();
	    String st;
	    int t;
	    while((st=sc.readLine())!=null){
		t = Integer.valueOf(st);
		if(t==0 && !s.empty())
		    x.add(s.pop());
		else if(t!=0)
		    s.push(t);
	    }
	    for(int i=0; i<x.size(); i++)
		System.out.println(x.get(i));
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}