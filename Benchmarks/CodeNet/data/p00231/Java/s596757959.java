import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    while(true){
		int n = Integer.valueOf(sc.readLine());
		if(n==0)
		    break;
		TreeMap<Integer,Integer> used = new TreeMap<Integer,Integer>();
		for(int i=0; i<n; i++){
		    String[] sp = sc.readLine().split(" ");
		    int m = Integer.valueOf(sp[0]);
		    int a = Integer.valueOf(sp[1]);
		    int b = Integer.valueOf(sp[2]);
		    if(used.containsKey(a)){
			int t = used.get(a);
			used.remove(a);
			used.put(a,t+m);
		    }else
			used.put(a,m);
		    if(used.containsKey(b)){
			int t = used.get(b);
			used.remove(b);
			used.put(b,t-m);
		    }else
			used.put(b,0-m);
		}
		int sum = 0;
		String out = "OK";
		for(int i:used.keySet()){
		    sum+=used.get(i);
		    if(sum>150){
			out = "NG";
			break;
		    }
		}
		System.out.println(out);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}