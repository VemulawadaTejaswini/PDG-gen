import java.io.*;
import java.util.*;
import java.math.*;
class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    String[] st;
	    while(true){
		int n = Integer.valueOf(sc.readLine());
		if(n==0)
		    break;
		int max=0, min=0, now=0;
		st = sc.readLine().split(" ");
		for(int j=0; j<5; j++)
		    now+=Integer.valueOf(st[j]);
		max = now; min = now;
		for(int i=1; i<n; i++){
		    now = 0;
		    st = sc.readLine().split(" ");
		    for(int j=0; j<5; j++)
			now+=Integer.valueOf(st[j]);
		    max = Math.max(max,now);
		    min = Math.min(min,now);
		}
		System.out.println(max+" "+min);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}