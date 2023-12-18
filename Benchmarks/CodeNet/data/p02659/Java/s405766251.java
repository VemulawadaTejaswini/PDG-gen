import java.awt.*;
import java.io.*;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;

public class Main {
    static Map<Long,Integer> map;
    public static void main(String[] args) throws Exception {
        FastReader sc = new FastReader();
        long a=sc.nextLong(),b=(long) (sc.nextDouble()*100);
        String x=(a*b)+"";
        if (x.equals("0")){
            System.out.println(x);
            return;
        }
        if (x.length()<3){
            System.out.println(0);
            return;
        }
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<x.length()-2;i++){
            sb.append(x.charAt(i));
        }
        System.out.println(sb);
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}