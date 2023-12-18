import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    String st;
	    TreeMap<String, TreeSet<Integer>> map = new TreeMap<String, TreeSet<Integer>>();
	    while((st=sc.readLine())!=null){
		String[] sp = st.split(" ");
		if(!map.containsKey(sp[0]))
		    map.put(sp[0], new TreeSet<Integer>());
		map.get(sp[0]).add(Integer.valueOf(sp[1]));
	    }
	    while(!map.isEmpty()){
		String word = map.firstKey();
		System.out.println(word);
		System.out.print(map.get(word).pollFirst());
		while(!map.get(word).isEmpty()){
		    System.out.print(" ");
		    System.out.print(map.get(word).pollFirst());
		}
		System.out.println();
		map.remove(word);
	    }
    	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}