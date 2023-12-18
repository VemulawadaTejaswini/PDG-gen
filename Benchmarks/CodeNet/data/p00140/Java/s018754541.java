import java.io.*;
import java.util.*;
import java.math.*;
class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    int n = Integer.valueOf(sc.readLine());
	    ArrayList<Integer> road;
	    for(int i=0; i<n; i++){
		road = new ArrayList<Integer>();
		String[] st = sc.readLine().split(" ");
		int in = Integer.valueOf(st[0]), out = Integer.valueOf(st[1]);
		if(in<=5)
		    if(in>out)
			for(int j=in; j>=out; j--)
			    road.add(j);
		    else
			for(int j=in; j<=out; j++)
			    road.add(j);
		else{
		    if(out>in)
			for(int j=in; j<=out; j++)
			    road.add(j);
		    else{
			for(int j=in; j<=9; j++)
			    road.add(j);
			if(out>=5){
			    for(int j=5; j>=0; j--)
				road.add(j);
			    for(int j=1; j<=out; j++)
				road.add(j);
			}
			else
			    for(int j=5; j>=out; j--)
				road.add(j);
		    }
		}
		for(int j=0; j<road.size()-1; j++)
		    System.out.print(road.get(j)+" ");
		System.out.println(road.get(road.size()-1));
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}