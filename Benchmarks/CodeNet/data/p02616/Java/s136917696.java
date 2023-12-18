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
            int k=scan.nextInt();
            num[] arr=new num[n];
            for(int i=0;i<n;i++){
                int num=scan.nextInt();
                arr[i]=new num(num);
            }
            Arrays.sort(arr);
            int neg=0;
            int pos=0;
            int ln=-1;
            int lp=-1;
            long mod=(long)1e9+7;
            for(int i=0;i<k;i++){
                if(arr[i].a<0){
                    neg++;
                    ln=i;
                }else{
                    pos++;
                    lp=i;
                }
            }
            if(neg%2==0||k==n){
                long ans=1;
                for(int i=0;i<k;i++){
                    ans=((ans*arr[i].a)%mod+mod)%mod;
                }
                out.println(ans);
            }else{
                int fp=-1;
                int fn=-1;
                for(int i=k;i<n;i++){
                    if(arr[i].a<0){
                        fn=i;
                    }else{
                        fp=i;
                    }
                }
                int skip=-1;
                int take=-1;
                boolean flag=false;
                if(lp==-1){
                    if(fp==-1){
                        flag=true;
                    }else{
                        skip=ln;
                        take=fp;
                    }
                }
                else if(fp==-1){
                    skip=lp;
                    take=fn;
                }else if(fn==-1){
                    skip=ln;
                    take=fp;
                }else{
                    if((long)arr[lp].a*arr[fp].a>=(long)arr[ln].a*arr[fn].a){
                        skip=ln;
                        take=fp;
                    }else{
                        skip=lp;
                        take=fn;
                    }
                }
                long ans=1;
                if(!flag) {
                    for (int i = 0; i < k; i++) {
                        if (i != skip) {
                            ans = ((ans * arr[i].a) % mod+mod)%mod;
                        }
                    }
                    ans = ((ans * arr[take].a) % mod+mod)%mod;
                }else{
                    for(int i=0;i<k;i++){
                        ans=((ans*arr[n-1-i].a)%mod+mod)%mod;
                    }
                }
                out.println(ans);
            }
        }
        out.flush();
        out.close();
    }
    static class num implements Comparable<num>{
        int a;
        num(int a){
            this.a=a;
        }

        @Override
        public int compareTo(num o) {
            return -Math.abs(this.a)+Math.abs(o.a);
        }
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
