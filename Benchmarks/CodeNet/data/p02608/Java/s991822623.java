import java.lang.*;
import java.util.*;
import java.io.*;

public class Main{
    public Hashtable<Integer,Integer>getNTriplesTbl(int n){
	Hashtable<Integer,Integer>retTab = new Hashtable<Integer,Integer>();
	for(int i=1;i<=100;i++){
	    for(int j=1;j<=100;j++){
		for(int k=1;k<=100;k++){
		    int p = i*i+j*j+k*k+i*j+j*k+k*i;
		    int ct = 0;
		    if(retTab.containsKey(p)){
			ct = retTab.get(p);
		    }
		    retTab.put(p,ct+1);
		}
	    }
	}
	return retTab;
    }
    
    public static void main(String[]args) throws Exception{
	Main m = new Main();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	String nLn = br.readLine();
	int n = Integer.parseInt(nLn);
	Hashtable<Integer,Integer>tripTab = m.getNTriplesTbl(n);
	for(int i=1;i<=n;i++){
	    int nTrip = 0;
	    if(tripTab.containsKey(i)){
		nTrip = tripTab.get(i);
	    }
	    bw.write(Integer.toString(nTrip));
	    bw.newLine();
	    bw.flush();
	}
    }
}
