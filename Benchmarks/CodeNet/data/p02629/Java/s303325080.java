/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Main {
	public static void main (String[] args) {
	    Scanner s=new Scanner(System.in);
	    int div=s.nextInt();
        int rem=0;String S="";
        while(div!=0)
        {
            rem=(div-1)%26;
            div=(div-1)/26;
            S+=(char)(rem+'a');
        }
        StringBuilder res=new StringBuilder(S);
        res.reverse();
        System.out.println(res);
	}}