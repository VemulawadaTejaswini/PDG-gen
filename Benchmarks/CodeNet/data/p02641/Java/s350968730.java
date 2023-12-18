//package atcoder.beginner_170;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    public static void main (String[] args) throws Exception {

        String s = "6 5\n" +
                "4 7 10 6 5";

//        br = new BufferedReader(new StringReader(s));
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        rl(); int X=nin(), N=nin();
        HashSet<Integer> set = new HashSet<>();
        for (int i=-100; i<=100; ++i) set.add(i);
        rl(); for (int i=0; i<N; ++i) set.remove(nin());
        int nearest = 1000;
        int diff = 1000;
        for (int v:set) {
            int _diff = Math.abs(X-v);
            if (_diff<diff) {
                diff=_diff;
                nearest = v;
            } else if (_diff==diff) {
                nearest = Math.min(nearest, v);
            }
        }

        bw.write(Integer.toString(nearest));
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