import java.io.*;
import java.util.StringTokenizer;

public class Main {

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
        FastReader fastReader = new FastReader();
        String S = fastReader.nextLine();
        char[] sx = S.toCharArray();
        for (int i = 0; i < sx.length; i++) {
            if (sx[i] == '?') {
                sx[i] = 'D';
            }
        }

        int k = 0, max = Integer.MIN_VALUE, count = 0;
        while (k < sx.length) {
            //System.out.println(" k = " + k);
            if (k + 1 < sx.length && sx[k] == 'P' && sx[k + 1] == 'D') {
                count += 2;
                k += 2;
            } else if (k + 1 < sx.length && sx[k] == 'D' && sx[k + 1] == 'D') {
                count += 2;
                k += 2;
            } else if (k + 1 < sx.length && sx[k] == 'D' && sx[k + 1] == 'P') {
                count++;
                k++;
            } else {
                max = Math.max(count, max);
                count = 0;
                k++;
            }
            max = Math.max(count, max);
        }
        System.out.println(max);
    }


}