import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    String[] st;
	    while(true){
		int n = Integer.valueOf(sc.readLine());
		if(n==0)
		    break;
		int max=0, min=500, now;
		for(int i=0; i<n; i++){
		    now = 0;
		    st = sc.readLine().split(" ");
		    for(int j=0; j<5; j++)
			now+=Integer.valueOf(st[j]);
		    if(now>max) max = now;
		    if(now<min) min = now;
		}
		System.out.println(max+" "+min);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}