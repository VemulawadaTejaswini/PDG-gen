

import java.util.*;
import java.io.*;

public class Main {
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        boolean ok = true;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; ++i) {
            if (arr[i] % 2 == 0 && (arr[i] % 3 != 0 && arr[i] % 5 != 0)) {
                ok = false;
                break;}
//             else if (arr[i] % 2 == 0 && (arr[i] % 3 == 0 || arr[i] % 5 == 0)) {
//                ok = true;
//            }
        }
        if (ok == true) System.out.println("APPROVED");
        else System.out.println("DENIED");

    }
}
