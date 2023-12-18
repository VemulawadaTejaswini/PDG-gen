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
            int h=scan.nextInt();
            int w=scan.nextInt();
            int k=scan.nextInt();
            String[] mat=new String[h];
            for(int i=0;i<h;i++){
                mat[i]=scan.next();
            }
            out.println(recur(0,new HashSet<>(),mat,h,w,k));
        }
        out.flush();
        out.close();
    }
    static int recur(int in,Set<Integer> s,String[] mat,int h,int w,int k){
        if(in==h+w){
            int bc=0;
            for(int i=0;i<h;i++){
                for(int j=0;j<w;j++){
                    if(mat[i].charAt(j)=='#'){
                        if(!s.contains(i)&&!s.contains(h+j)){
                            bc++;
                        }
                    }
                }
            }
            if(bc==k){
                return 1;
            }
            return 0;
        }
        int ans=0;
        s.add(in);
        ans+=recur(in+1,s,mat,h,w,k);
        s.remove(in);
        ans+=recur(in+1,s,mat,h,w,k);
        return ans;
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
