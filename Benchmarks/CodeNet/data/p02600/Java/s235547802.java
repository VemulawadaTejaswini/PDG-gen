//package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;
//****Use Integer Wrapper Class for Arrays.sort()****
public class Main {
    static PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] Args)throws Exception{
        FastReader scan=new FastReader(System.in);
        int t=1;
//        t=scan.nextInt();
        while(t-->0){
            int x=scan.nextInt();
            if(x>=400&&x<600){
                out.println(8);
            }if(x>=600&&x<800){
                out.println(7);
            }if(x>=800&&x<1000){
                out.println(6);
            }if(x>=1000&&x<1200){
                out.println(5);
            }if(x>=1200&&x<1400){
                out.println(4);
            }if(x>=1400&&x<1600){
                out.println(3);
            }if(x>=1600&&x<1800){
                out.println(2);
            }if(x>=1800&&x<2000){
                out.println(1);
            }
        }
        out.flush();
        out.close();
    }
    static class FastReader {

        byte[] buf = new byte[2048];
        int index, total;
        InputStream in;

        FastReader(InputStream is) {
            in = is;
        }

        int scan() throws IOException {
            if (index >= total) {
                index = 0;
                total = in.read(buf);
                if (total <= 0) {
                    return -1;
                }
            }
            return buf[index++];
        }

        String next() throws IOException {
            int c;
            for (c = scan(); c <= 32; c = scan()) ;
            StringBuilder sb = new StringBuilder();
            for (; c > 32; c = scan()) {
                sb.append((char) c);
            }
            return sb.toString();
        }

        int nextInt() throws IOException {
            int c, val = 0;
            for (c = scan(); c <= 32; c = scan()) ;
            boolean neg = c == '-';
            if (c == '-' || c == '+') {
                c = scan();
            }
            for (; c >= '0' && c <= '9'; c = scan()) {
                val = (val << 3) + (val << 1) + (c & 15);
            }
            return neg ? -val : val;
        }
        long nextLong() throws IOException {
            int c;
            long val = 0;
            for (c = scan(); c <= 32; c = scan()) ;
            boolean neg = c == '-';
            if (c == '-' || c == '+') {
                c = scan();
            }
            for (; c >= '0' && c <= '9'; c = scan()) {
                val = (val << 3) + (val << 1) + (c & 15);
            }
            return neg ? -val : val;
        }
    }
}
