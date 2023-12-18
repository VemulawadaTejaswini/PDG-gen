//package atcoder.beginner_172;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main (String[] args) throws Exception {

        String s = "3 4 6\n" +
                "2 1 3\n" +
                "2 1 1 1";

//        br = new BufferedReader(new StringReader(s));
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        rl(); int N=nin(), M=nin(); long K=nlo();
        rl(); long A[]=new long[N]; A[0] = nlo(); for (int i=1; i<N; ++i) A[i]=A[i-1]+nin();
        rl(); long B[]=new long[M]; B[0] = nlo(); for (int i=1; i<M; ++i) B[i]=B[i-1]+nin();

        int c=Arrays.binarySearch(B, K);
        if (c<0) c=-c-1;
        for (int i=0; i<N && A[i]<=K; ++i) {
            int j=Arrays.binarySearch(B, K-A[i]);
            if (j<0) j=-j-2;
            c=Math.max(c, i+j+2);
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