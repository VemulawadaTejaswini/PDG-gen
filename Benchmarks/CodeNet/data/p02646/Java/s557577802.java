//package atcoder.tokio_marine_insurance_2020;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main (String[] args) throws Exception {

        String s = "1 2\n" +
                "3 2\n" +
                "3";

//        br = new BufferedReader(new StringReader(s));
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        rl(); long A = nlo(), V=nlo();
        rl(); long B = nlo(), W=nlo();
        rl(); long T = nlo();
        boolean c= (A+V*T) >= (B+W*T);
        bw.write(c ? "YES" : "NO");
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