import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        HashMap<String, Integer> hmap = new HashMap<>();
        while (t-- > 0) {
            String verdict = sc.next();
            hmap.put(verdict, hmap.getOrDefault(verdict, 0) + 1);
        }
        System.out.println("AC x " + (hmap.get("AC") == null ? 0 : hmap.get("AC")));
        System.out.println("WA x " + (hmap.get("WA") == null ? 0 : hmap.get("WA")));
        System.out.println("TLE x " + (hmap.get("TLE") == null ? 0 : hmap.get("TLE")));
        System.out.println("RE x " + (hmap.get("RE") == null ? 0 : hmap.get("RE")));
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
