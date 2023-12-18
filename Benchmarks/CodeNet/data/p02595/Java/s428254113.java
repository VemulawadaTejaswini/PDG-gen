//package atcoder.beginner_174;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main (String[] args) throws Exception {

        String s = "20 100000\n" +
                "14309 -32939\n" +
                "-56855 100340\n" +
                "151364 25430\n" +
                "103789 -113141\n" +
                "147404 -136977\n" +
                "-37006 -30929\n" +
                "188810 -49557\n" +
                "13419 70401\n" +
                "-88280 165170\n" +
                "-196399 137941\n" +
                "-176527 -61904\n" +
                "46659 115261\n" +
                "-153551 114185\n" +
                "98784 -6820\n" +
                "94111 -86268\n" +
                "-30401 61477\n" +
                "-55056 7872\n" +
                "5901 -163796\n" +
                "138819 -185986\n" +
                "-69848 -96669";

//        br = new BufferedReader(new StringReader(s));
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        rl(); int n=nin(), d=nin();
        int c=0;
        for (int i=0; i<n; ++i) {
            rl();
            double x=ndo(), y=ndo();
            double D=Math.sqrt(x*x+y*y);
            if (D<=d) ++c;
        }

        bw.write(Integer.toString(c));
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