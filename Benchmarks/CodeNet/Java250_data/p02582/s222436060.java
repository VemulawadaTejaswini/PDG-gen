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
        String s = fs.next();
        char[] S = s.toCharArray();

        int c = 0;
        boolean rain = false;
        for (int i = 0; i<2; i++) {
            if (S[i] == S[i+1] && S[i] == 'R') {
                c++;

            }
        }
        for (int i = 0; i<3;i++) {
            if (S[i] == 'R') {
                rain = true;
            }
        }
        if (rain) {
            System.out.println(c+1);
        } else {
            System.out.println(0);
        }



    }


    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");

        public String next() {
            while (!st.hasMoreElements())
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
    }

}
