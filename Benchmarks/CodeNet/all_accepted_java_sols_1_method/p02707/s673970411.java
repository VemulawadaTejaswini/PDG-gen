/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
        int a[]=new int[n-1];
        int f[]=new int[n+1];
        for(int i=0;i<n-1;i++){
            a[i]=s.nextInt();
            f[a[i]]++;
        }
        int c=0;
        int prev=1;
      //  System.out.println
        for(int i=1;i<=n;i++){
            
                System.out.println(f[i]);
               
            }
        
	}
}