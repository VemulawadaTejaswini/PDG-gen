import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
	
	int je, ix=0, sum=0;
	int[] itu = new int[100];
	String st;
	Scanner sc = new Scanner(System.in);
	ArrayList<String> ar = new ArrayList<String>();
	Map<String,String> mp = new HashMap<String, String>();
	
	while(true){
	    je = sc.nextInt();
	    if(je==0)
		break;
	    for(int j=0; j<je; j++)
		mp.put(sc.next(), sc.next());
	    je = sc.nextInt();
	    for(int j=0; j<je; j++){
		st = sc.next();
		if(mp.containsKey(st))
		    ar.add(mp.get(st));
		else
		    ar.add(st);
	    }
	    sum+=je;
	    itu[ix] = sum;
	    ix++;
	}
	ix=0;
	for(int j=0; j<ar.size();j++){
	    if(itu[ix]==j){
		ix++;
		System.out.println();
	    }
	    System.out.print(ar.get(j));
	}
	System.out.println();
    }
}