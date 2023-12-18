//package atcoder.beginner_171;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

    public static void main (String[] args) throws Exception {

        String s = "2\n" +
                "1 2\n" +
                "3\n" +
                "1 100\n" +
                "2 100\n" +
                "100 1000";

//        br = new BufferedReader(new StringReader(s));
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        rl(); long N=nin();

        long sum=0;
        HashMap<Integer, Integer> map = new HashMap<>();

        rl();
        for (int i=0; i<N; ++i) {
            int v=nin();
            if (map.containsKey(v)) {
                map.put(v, map.get(v)+1);
            } else {
                map.put(v,1);
            }
            sum+=v;
        }

        rl(); long Q=nin();
        for (int i=0; i<Q; ++i) {
            rl(); int B=nin(), C=nin();
            if (map.containsKey(B)) {
                int D = map.remove(B);

                sum -= (D * B);
                sum += (D * C);
                if (map.containsKey(C)) {
                    int _D = map.get(C);
                    map.put(C, D + _D);
                } else {
                    map.put(C, D);
                }
            }
            bw.write(Long.toString(sum));
            bw.newLine();
        }

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