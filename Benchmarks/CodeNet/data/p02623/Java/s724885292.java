

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

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

    public static void main(String[] args) {
        FastReader in = new FastReader();
        long n = in.nextLong();
        long m = in.nextLong();
        long k = in.nextLong();
        Stack<Long> a = new Stack<>();
        Stack<Long> b = new Stack<>();
        for (int i=0;i<n;i++)
            a.push(in.nextLong());
        for (int i=0;i<m;i++)
            a.push(in.nextLong());
        long sum = 0;
        long count = 0;
        if(k==1)
            count = 0;
        else {
            while (sum <= k) {
                if (!a.isEmpty() && !b.isEmpty()) {
                    if (a.peek() < b.peek()) {
                        sum = sum + a.pop();
                    } else sum = sum + b.pop();
                    count++;
                } else if (a.isEmpty() && !b.isEmpty()) {
                    sum = sum + b.pop();
                    count++;
                } else if (!a.isEmpty() && b.isEmpty()) {
                    sum = sum + a.pop();
                    count++;
                } else break;
            }
        }
        System.out.println(count);
    }
}