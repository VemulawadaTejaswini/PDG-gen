/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

public class Main {
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
        int m=s.nextInt();
        int ss=0;
        while(m-->0)
        ss+=s.nextInt();
        if(n>=ss)
		System.out.println(n-ss);
		else
		System.out.println(-1);
	}
}