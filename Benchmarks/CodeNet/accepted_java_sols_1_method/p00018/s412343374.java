import java.io.*;
import java.util.*;
class Main{
    public static void main(String[] args){
	try{
	    BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
	    String[] st = sc.readLine().split(" ");
	    int[] x = new int[5];
	    for(int i=0; i<5; i++)
		x[i] = Integer.valueOf(st[i]);
	    
	    Arrays.sort(x);
	    System.out.printf("%d %d %d %d %d\n",x[4],x[3],x[2],x[1],x[0]);
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}