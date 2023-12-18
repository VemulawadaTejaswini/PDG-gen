import java.io.*;
import java.util.*;

class Main{
    static int[] map = new int[300];
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try {
	    fillup(1,0);
	    while(true){
		int n = Integer.valueOf(sc.readLine()), sum = 0;
		if(n==0)
		    break;
		System.out.println(map[n]);
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
    static void fillup(int k,int sum){
	if(k==18)
	    return;
	for(int i=k; sum+i*i<300; i++){
	    map[sum+i*i]++;
	    fillup(i,sum+i*i);
	}
    }
}