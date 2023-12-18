/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Main {
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
        int div=n;
        int rem=0;String S="";
        while(true)
        {
            rem=(div-1)%26;
            div=(div-1)/26;
            char c=(char)(rem+'a');
            S+=c;
            if(div==0)break;
            
        }
        StringBuilder res=new StringBuilder(S);
        res.reverse();
        System.out.println(res);
	}}