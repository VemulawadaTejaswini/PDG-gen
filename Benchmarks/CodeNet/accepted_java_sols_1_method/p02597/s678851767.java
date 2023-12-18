/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;


class Main {
	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();

        char[] a = in.next().toCharArray();
        int red = 0,ans = 0;
        for(int i=0;i<n;i++) {
            if(a[i] == 'R') red++;
        }
        for(int i=0;i<red;i++) {
            if(a[i] == 'W') ans++;
        }

        System.out.println(ans);
	}
}