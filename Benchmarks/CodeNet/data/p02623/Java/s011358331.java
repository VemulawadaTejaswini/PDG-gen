//package atcoder.beginner_172;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main (String[] args) throws Exception {

        String s = "3 4 240\n" +
                "60 90 120\n" +
                "80 150 80 150";

//        br = new BufferedReader(new StringReader(s));
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        rl(); int N=nin(), M=nin(), K=nin();
        rl(); int A[]=new int[N]; for (int i=0; i<N; ++i) A[i]=nin();
        rl(); int B[]=new int[M]; for (int i=0; i<M; ++i) B[i]=nin();

        int c=0; int i=0, j=0;
        while (K>0 && (A[i]<=K || B[j]<=K)) {
            if (i<N && j<M && A[i]<B[j] && A[i]<=K) {
                K-=A[i++]; ++c;
            }
            if (i<N && j==M && A[i]<=K) {
                K-=A[i++]; ++c;
            }
            if (j<M && i<N && A[i]>=B[j] && B[j]<=K) {
                K-=B[j++]; ++c;
            }
            if (j<M && i==N && B[j]<=K) {
                K-=B[j++]; ++c;
            }
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