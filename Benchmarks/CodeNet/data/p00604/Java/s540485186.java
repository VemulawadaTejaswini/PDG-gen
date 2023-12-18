import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    String st;
	    TreeSet<Integer> map;
	    while((st=sc.readLine())!=null){
		String[] sp = sc.readLine().split(" ");
		map = new TreeSet<Integer>();
		for(int i=0; i<sp.length; i++)
		    map.add(Integer.valueOf(sp[i]));
		int sumnow = 0, sum = 0;
		for(int i : map){
		    sumnow+=i;
		    sum+=sumnow;
		}
		System.out.println(sum);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}