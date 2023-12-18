//package atcoder.beginnner_176;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main (String[] args) throws Exception {

        String s = "123456789";

//        br = new BufferedReader(new StringReader(s));
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        rl(); char[] N = nca();
        long n=0;
        for (int i=0; i<N.length; ++i) n+=(N[i]-'0');
        bw.write((n%9==0?"Yes":"No") + "\n");
        bw.flush();
    }

    static BufferedReader br; static BufferedWriter bw; static StringTokenizer st;
    static void rl() throws Exception{ st = new StringTokenizer(br.readLine()); }
    static long nlo(){ return Long.parseLong(st.nextToken()); }
    static int nin(){ return Integer.parseInt(st.nextToken()); }
    /*private static void te(){}*/
    static double ndo(){ return Double.parseDouble(st.nextToken()); }
    static char[] nca(){ return st.nextToken().toCharArray(); }
}
