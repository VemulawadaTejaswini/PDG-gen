/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = 0;
		long  d = in.nextInt();
      	d = d*d;
        for(int i=0;i<n;i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            long  sq = (long)(x*x + y*y);
            if(sq <= d)
            count++;
        }
        
		
	    System.out.println(count);
	
	}
}
