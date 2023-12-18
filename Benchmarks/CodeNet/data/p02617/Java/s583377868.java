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
            Node[] gr=new Node[n+1];
            for(int i=0;i<n;i++){
                gr[i+1]=new Node();
            }
            for(int i=0;i<n-1;i++){
                int u=scan.nextInt();
                int v=scan.nextInt();
                if(u>v){
                    gr[u].ns.add(v);
                    gr[v].ts.add(u);
                }else{
                    gr[v].ns.add(u);
                    gr[u].ts.add(v);
                }
            }
            long ans=0;
            Set<Integer> up=new HashSet<>();
            int[] p=new int[n+1];
            for(int i=1;i<=n;i++){
                p[i]=i;
            }
            for(int i=1;i<=n;i++){
                for(Integer j:gr[i].ns){
                    int sp=find(p,j);
                    up.remove(sp);
                    p[sp]=i;
                }
                up.add(i);
                ans+=up.size();
            }
            long temp=ans;
            for(int i=1;i<n;i++){
                gr[i].ts.add(n+1);
                int pr=i;
                int v=-1;
                for(Integer j:gr[i].ts){
                    temp+=(long)(j-pr)*v;
                    v++;
                    pr=j;
                }
                ans+=temp;
            }
            out.println(ans);
        }
        out.flush();
        out.close();
    }
    static int find(int[] p,int i){
        if(p[i]==i){
            return i;
        }
        return p[i]=find(p,p[i]);
    }
    static class Node{
        Set<Integer> ns;
        TreeSet<Integer> ts;
        Node(){
            ns=new HashSet<>();
            ts=new TreeSet<>();
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
