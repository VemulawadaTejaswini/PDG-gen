import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
	BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	try{
	    int i, n = Integer.valueOf(sc.readLine());
	    String[] st = sc.readLine().split(" ");
	    int[] map = new int[n];
	    for(i=0; i<n; i++)
		map[i] = Integer.valueOf(st[i]);
	    Arrays.sort(map);
	    int sum = map[0];
	    for(i=1; i<=n; i++){
		if(i==n||map[i]>sum+1){
		    System.out.println(sum+1);
		    break;
		}
		sum += map[i];
	    }
	}catch(Exception e){
	    System.out.println("Error");
	}
    }
}