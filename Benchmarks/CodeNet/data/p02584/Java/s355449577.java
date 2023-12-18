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
        long x = Math.abs(fs.nextLong());
        long k = fs.nextLong();
        long d = fs.nextLong();
        long movesUntilZero = x/d;

        if (x - k*d > 0) {
            System.out.println(x-k*d);
        } else {
            if ((k-movesUntilZero)%2 == 0) {
                System.out.println(Math.abs(x-movesUntilZero*d));
            } else {
                System.out.println(Math.abs(x-(movesUntilZero+1)*d));

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
