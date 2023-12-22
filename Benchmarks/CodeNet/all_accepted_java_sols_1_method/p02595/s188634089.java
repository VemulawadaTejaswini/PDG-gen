/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;


class Main {
	public static void main (String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
        long d = in.nextLong();
        d = (long ) d * d;
        
        int answer = 0;
        for (int i=0;i<n;i++) {
            long x = in.nextLong();
            long y = in.nextLong();
            if (x * x + y * y <= d)
                answer++;
        }

        System.out.println(answer);
	}
}