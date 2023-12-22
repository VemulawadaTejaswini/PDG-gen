
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();

        int[] aa = new int[]{p,q,r};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i<aa.length; i++) {
            for (int j = 0; j < aa.length; j++) {
                if (i == j) continue;
                min = Math.min(min, aa[i]+aa[j]);
            }
        }
        out.println(min);
        out.flush();

    }

    static class Toi {
        public int x;
        public int y;

        public Toi(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }

            if (this == obj) {
                return true;
            }

            if (this.getClass() != obj.getClass()) {
                return false;
            }

            Toi toi = (Toi) obj;
            return x == toi.x && y == toi.y;
        }
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