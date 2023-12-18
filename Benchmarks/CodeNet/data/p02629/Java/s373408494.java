/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Main {
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
        int div=n;
        int rem=0;StringBuilder res=new StringBuilder("");
        while(div!=0)
        {
            rem=(div-1)%26;
            div=(div-1)/26;
            char c=(char)(rem+'a');
            res.append(c);
            
        }
        res.reverse().toString();
        System.out.println(res);
	}}