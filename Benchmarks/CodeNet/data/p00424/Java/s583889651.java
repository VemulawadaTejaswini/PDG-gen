import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args){
	
	int je;
	String st;
	Scanner sc = new Scanner(System.in);
	Map<String,String> mp = new HashMap<String, String>();
	
	while(true){
	    je = sc.nextInt();
	    if(je==0)
		break;
	    for(int j=0; j<je; j++)
		mp.put(sc.next(), sc.next());
	    je = sc.nextInt();
	    StringBuilder ar = new StringBuilder();
	    for(int j=0; j<je; j++){
		st = sc.next();
		if(mp.containsKey(st))
		    ar.append(mp.get(st));
		else
		    ar.append(st);
	    }
	    System.out.println(ar.toString());
	}
    }
}