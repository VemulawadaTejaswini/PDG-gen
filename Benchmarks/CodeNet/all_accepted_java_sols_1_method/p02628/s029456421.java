/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Main {
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
        int k = s.nextInt();
      int [] p = new int[n];
      
      for(int i=0; i<n; i++ ) 
         p[i] = s.nextInt();
           Arrays.sort(p);
           int sum=0;
	    for(int i=0;i<k;i++)
	    sum+=p[i];
	    System.out.println(sum);
	
}
}
