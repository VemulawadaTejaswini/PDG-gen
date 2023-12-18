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
            int m=scan.nextInt();
            Node[] gr=new Node[n+1];
            for(int i=1;i<=n;i++){
                gr[i]=new Node();
            }
            for(int i=0;i<m;i++){
                int u=scan.nextInt();
                int v=scan.nextInt();
                gr[u].ns.add(v);
                gr[v].ns.add(u);
            }
            boolean[] vis=new boolean[n+1];
            int ans=0;
            for(int i=1;i<=n;i++){
                if(!vis[i]){
                    int c=0;
                    vis[i]=true;
                    c++;
                    Queue<Integer> q=new LinkedList<>();
                    ((LinkedList<Integer>) q).add(i);
                    while(!q.isEmpty()){
                        Node u=gr[q.remove()];
                        for(Integer v:u.ns){
                            if(!vis[v]) {
                                vis[v] = true;
                                ((LinkedList<Integer>) q).add(v);
                                c++;
                            }
                        }
                    }
                    ans=Math.max(ans,c);
                }
            }
            out.println(ans);
        }
        out.flush();
        out.close();
    }
    static class Node{
        Set<Integer> ns;
        Node(){
            ns=new HashSet<>();
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
