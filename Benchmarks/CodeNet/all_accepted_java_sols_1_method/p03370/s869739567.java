/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
public class Main {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt(), x = sc.nextInt();
	    int min =10002;
	    int sum = 0;
	    int cnt =0;
	    for(int i=0;i<n;i++){
	        int t =sc.nextInt();
	        sum+=t;
	        min = Math.min(min, t);
	    }
	    cnt+=n;
	    int val = x-sum;
	    //System.out.println(val);
	    
	    System.out.println(cnt+val/min);
	}
}