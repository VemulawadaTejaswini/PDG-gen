import java.util.*;
import java.io.*;

class Raniys {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        String a = sc.next();
        HashMap<Character, Integer> hp = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            hp.put(a.charAt(i), hp.getOrDefault(a.charAt(i), 0) + 1);
        }
        System.out.println((hp.get('R') == null) ? 0 : hp.get('R'));
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