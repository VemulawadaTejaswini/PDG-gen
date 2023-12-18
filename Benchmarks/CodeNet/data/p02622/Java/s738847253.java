
import java.io.*;

import java.lang.annotation.Native;
import java.math.BigInteger;
import java.util.*;

import java.util.ArrayList;

import java.util.Scanner;


public class Main {

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

    static final int mod = 1000000007;
    static final int mod1 = 1073741824;

    public static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    static boolean prime[] = new boolean[1000001];
    public static void merge(long arr[][], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        long L[][] = new long[n1][2];
        long R[][] = new long[n2][2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
        {
            L[i][0] = arr[l + i][0];
            L[i][1] = arr[l + i][1];


        }

        for (int j = 0; j < n2; ++j) {
            R[j][0] = arr[m + 1 + j][0];
            R[j][1] = arr[m + 1 + j][1];
        }

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i][0] <= R[j][0]) {
                arr[k][0] = L[i][0];
                arr[k][1] = L[i][1];

                i++;
            }
            else {
                arr[k][0] = R[j][0];
                arr[k][1] = R[j][1];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k][0] = L[i][0];
            arr[k][1] = L[i][1];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k][0] = R[j][0];
            arr[k][1] = R[j][1];

            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    public static long[][] sort2elementarray(long arr[][], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;

            // Sort first and second halves
            sort2elementarray(arr, l, m);
            sort2elementarray(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
        return arr;
    }
        /*for(int j=2;j<=n;j++)
        {
            if(prime[j]==true)
                System.out.println(j);
        }*/



    public static void main(String[] args) {
        FastReader sc = new FastReader();
        String s=sc.nextLine();
        String t=sc.nextLine();
        int c=0;
        for(int j=0;j<s.length();j++)
        {
            if(s.charAt(j)!=t.charAt(j))
                c++;
        }
        System.out.println(c);

    }
}


















