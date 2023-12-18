//package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class AC_171_C {
    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        long n=Long.parseLong(br.readLine());
        char a[]=new char[27];
        for(int i=1;i<=26;++i)
            a[i]=(char)(i-1+'a');
        StringBuffer sb=new StringBuffer();
        while(n>0) {
            long p=n%26;
            sb.append(a[(int)p]);
            n/=26;
        }
        System.out.println(sb.reverse().toString());
    }
}
