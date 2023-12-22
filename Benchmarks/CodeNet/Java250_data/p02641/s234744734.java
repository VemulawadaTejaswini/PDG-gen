import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.lang.Math;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int x = fs.nextInt();
        int n = fs.nextInt();
        int[] ar = fs.readArray(n);

        for (int i = 0; i<100; i++) {
            boolean dec = inArray(ar,x-i,n);
            boolean inc = inArray(ar,x+i,n);
            if (dec == true && inc == true) {
                System.out.println(x-i);
                break;
            } else if (dec==true) {
                System.out.println(x-i);
                break;
            } else if (inc == true) {
                System.out.println(x+i);
                break;
            } else {
                continue;
            }

        }
    }
    public static boolean inArray(int[] ar, int x, int n) {

        for (int i = 0; i<n; i++) {
            if (x==ar[i]) {
                return false;
            }
        }
        return true;

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

