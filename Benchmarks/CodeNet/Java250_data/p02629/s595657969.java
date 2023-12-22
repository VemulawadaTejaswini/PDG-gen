//package atcoder.beginner_171;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main (String[] args) throws Exception {

        String s = "27";

//        br = new BufferedReader(new StringReader(s));
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        rl(); long N=nlo();

        StringBuffer sb=new StringBuffer();
        while (N>26) {
            char c=(char)(N%26);
            if (c>0) {
                c+=96;
                N/=26;
            } else {
                c='z';
                N=(N-26)/26;
            }
            sb.insert(0, c);
        }

        char c=(char)(N%26);
        if (c>0) c+=96; else c='z';
        sb.insert(0, c);

        bw.write(sb.toString());
        bw.newLine();
        bw.flush();

    }

    static BufferedReader br;
    static BufferedWriter bw;
    static StringTokenizer st;
    static void rl() throws Exception{
        st = new StringTokenizer(br.readLine());
    }
    static long nlo(){
        return Long.parseLong(st.nextToken());
    }
    static int nin(){
        return Integer.parseInt(st.nextToken());
    }
    /*private static void te(){
      }*/
    static double ndo(){
        return Double.parseDouble(st.nextToken());
    }
    static char[] nca(){
        return st.nextToken().toCharArray();
    }
    static String nstr(){
        return st.nextToken();
    }
}