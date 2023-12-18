/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;

class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = 0;
		int d = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = in.nextInt();
            b[i] = in.nextInt();
        }
        for(int i=0;i<n;i++) {
            int  sq = (a[i]*a[i] + b[i]*b[i]);
            if(sq <= d*d)
            count++;
        }
		
	    System.out.println(count);
	
	}
}