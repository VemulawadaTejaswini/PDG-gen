package com.codeforces.round654;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    static ArrayList<Integer> primes = new ArrayList<>();

    static long lcm(long n){
        long ans = 1;
        for (int i=0; i<primes.size() && primes.get(i)<=n; i++)
        {
            int pp = primes.get(i);
            while (pp*primes.get(i) <= n)
                pp = pp *primes.get(i);
            ans *= pp;
        }
        return ans;
    }
    public static void main(String[] args) throws Exception {
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int x = fr.nextInt();
        int xx = x;
        int t = fr.nextInt();
        int tt = t;
        while(x<n){
            x+=xx;
            t+=tt;
        }
        System.out.println(t);
    }
}