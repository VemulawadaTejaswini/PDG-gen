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
            int n=scan.nextInt();
            Map<Integer,Integer> m=new HashMap<>();
            for(int i=0;i<n;i++){
                int num=scan.nextInt();
                boolean ca=false;
                while (num%2==0) {
                    ca=true;
                    num /= 2;
                }
                if(ca){
                    m.putIfAbsent(2,0);
                    m.put(2,m.get(2)+1);
                }
                for (int j = 3; j <= Math.sqrt(num); j+= 2) {
                    boolean can=false;
                    while (num%j == 0) {
                        num /= j;
                        can=true;
                    }
                    if(can){
                        m.putIfAbsent(j,0);
                        m.put(j,m.get(j)+1);
                    }
                }
                if (num > 2){
                    m.putIfAbsent(num,0);
                    m.put(num,m.get(num)+1);
                }
            }
            boolean pw=true;
            boolean sw=true;
            for(Integer i:m.keySet()){
                int f=m.get(i);
                if(f>=2){
                    pw=false;
                }
                if(f==n){
                    sw=false;
                }
            }
            if(pw){
                out.println("pairwise coprime");
            }else{
                if(sw){
                    out.println("setwise coprime");
                }else{
                    out.println("not coprime");
                }
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
