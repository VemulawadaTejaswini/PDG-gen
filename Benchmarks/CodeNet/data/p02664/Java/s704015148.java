//package NomuraContest2020;

import java.util.*;
import java.io.*;
import java.math.*;


class Main {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //Start here:
        String s=br.readLine();
        
        int n=s.length();
        StringBuffer bf=new StringBuffer("");
        for(int i=0;i<n;i++)
        {
        	char ch=s.charAt(i);
        	if(ch=='?')
        	{
        		bf.append("D");
        	}
        	else
        	{
        		bf.append(ch);
        	}
        }
        System.out.println(bf.toString());

    }
    //D?D?
    //PDDDDDP
}