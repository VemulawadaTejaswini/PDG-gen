import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.Math;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        long x = fs.nextLong();
        long k = fs.nextLong();
        long d = fs.nextLong();

        long movesZero = Math.abs(x / d);

        long lowerLim = 0;
        long upperLim = 0;
        if (x > 0) {
            lowerLim = x- d*movesZero;
            upperLim = x- d*(movesZero + 1);
        } else {
            lowerLim = x + d*movesZero;
            upperLim = x + d*(movesZero + 1);
        }

        if (x > 0 && (x-k*d)>0) {
            System.out.println(Math.abs(x - k * d));

        } else if (x < 0 && (x+k*d)<0) {
            System.out.println(Math.abs(x + k*d));
        } else {
            if ((k-movesZero)%2 == 0) {
                System.out.println(Math.abs(lowerLim));

            } else {
                System.out.println(Math.abs(upperLim));
            }
        }
    }


    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens())
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
        int[] readArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }
        long nextLong() {
            return Long.parseLong(next());
        }
    }

}
