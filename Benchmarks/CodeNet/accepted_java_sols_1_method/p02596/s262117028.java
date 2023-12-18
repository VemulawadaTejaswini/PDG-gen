/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;


class Main {
	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
        int x =  7 % n;
        int answer = 0;
        for (int i=1;i<=n;i++) {
            if(x == 0) {
                System.out.println(i);
                return;
            }
            x = (x*10 + 7 ) % n;
        }

        System.out.println(-1);
	}
}