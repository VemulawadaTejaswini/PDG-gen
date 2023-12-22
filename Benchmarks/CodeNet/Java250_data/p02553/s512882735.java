//package atcoder.beginner_178;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main (String[] args) throws Exception {

        String s = "-1000000000 0 -1000000000 0";

//        br = new BufferedReader(new StringReader(s));
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        rl(); long a = nlo(), b=nlo(), c=nlo(), d=nlo();
        if (a<=0 && b<=0 && c>=0 && d>=0) {
            bw.write( (b*c) + "\n");
        } else if (a>=0 && b>=0 && c<=0 && d<=0) {
            bw.write( (a*d) + "\n");
        } else {
            bw.write( Math.max(a*c, b*d) + "\n");
        }
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
