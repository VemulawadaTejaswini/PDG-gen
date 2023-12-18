
import java.io.*;

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

    public static void sieve() {
        int n = 1000000;

        Arrays.fill(prime, true);
        for (int j = 2; j * j <= n; j++) {
            if (prime[j] == true) {
                for (int i = j * j; i <= n; i += j) {
                    prime[i] = false;
                }
            }
        }
        /*for(int j=2;j<=n;j++)
        {
            if(prime[j]==true)
                System.out.println(j);
        }*/

    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        //Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int j=0;j<n;j++) {
            a[j] = sc.nextInt();

        }
        Arrays.sort(a);
        long ans=0;
        for(int j=0;j<k;j++)
            ans+=a[j];
        System.out.println(ans);



    }
}


















