import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int len = sc.nextInt();
        String a = sc.next();
        char[] chars = a.toCharArray();
        System.out.println(countermin(chars));
    }

    static int countermin(char[] chars) {
        int left = 0, tc = 0;
        int right = chars.length - 1;
        while (left < right) {
            while (left < right && chars[left] == 'R') {
                left++;
            }
            while (right > left && chars[right] == 'W') {
                right--;
            }
            if (left < right) {
                tc++;
                left++;
                right--;
            }
        }
        return tc;
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
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