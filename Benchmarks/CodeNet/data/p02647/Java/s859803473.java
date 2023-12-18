//package atcoder.tokio_marine_insurance_2020;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main (String[] args) throws Exception {

//        String s = "5 1\n" +
//                "1 0 0 1 0";

//        String s = "5 2\n" +
//                "1 0 0 1 0";

        String s = "40 40\n" +
                "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0";

//        br = new BufferedReader(new StringReader(s));
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        rl(); int N=nin(), K=nin();
        rl(); int A[] = new int[N]; for (int i=0; i<N; ++i) A[i] = nin();
        boolean cont=true;
        while (K>0 && cont) {
            int _A[] = new int[N];
            for (int i=0; i<N; ++i) {
                int from=Math.max(0, i-A[i]);
                int to=Math.min(N-1, i+A[i]);
                for (int j=from; j<=to; ++j) {
                    ++_A[j];
                }
            }
            cont = false;
            for (int i:_A) {
                if (i<N) cont = true;
                break;
            }
            int[] temp = A; A=_A; _A=temp;
            --K;
        }

        bw.write(Integer.toString(A[0]));
        for (int i=1; i<N; ++i) {
            bw.write(" " + Integer.toString(A[i]));
        }
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