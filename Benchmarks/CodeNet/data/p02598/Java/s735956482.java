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
            k+=n;
            long[] arr=new long[n];
            double sum=0;
            for(int i=0;i<n;i++){
                arr[i]=scan.nextInt();
                sum+=arr[i];
            }
            log[] logs=new log[n];
            int[] cuts=new int[n];
            int done=0;
            for(int i=0;i<n;i++){
                long num=k*arr[i];
                int mc=(int)Math.floor(num/sum);
                cuts[i]=Math.max(1,mc);
                double rem=arr[i]/(double)(cuts[i]);
                done+=cuts[i];
                logs[i]=new log(i,rem);
            }
            k-=done;
            Arrays.sort(logs);
            for(int i=0;i<k;i++){
                cuts[logs[i].id]++;
            }
            int ans=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                ans=Math.max(ans,(int)Math.round(arr[i]/(double)(cuts[i])));
            }
            out.println(ans);
        }
        out.flush();
        out.close();
    }
    static class log implements Comparable<log>{
        int id;
        double rem;
        log(int id,double rem){
            this.id=id;
            this.rem=rem;
        }

        @Override
        public int compareTo(log o) {
            if(this.rem>=o.rem){
                return -1;
            }else{
                return 1;
            }
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
