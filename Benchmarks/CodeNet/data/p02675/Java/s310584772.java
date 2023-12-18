import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Big {
    public static void main(String[] args) throws IOException{
        FastReader sc = new FastReader();
        String str = sc.next();
        char ch = str.charAt(str.length()-1);
        HashSet<Character> hon = new HashSet<>();
        hon.add('2');hon.add('4');hon.add('5');hon.add('7');hon.add('9');
        HashSet<Character> pon = new HashSet<>();
        pon.add('0');pon.add('1');pon.add('8');pon.add('6');
        HashSet<Character> bon = new HashSet<>();
        bon.add('3');
        if (hon.contains(ch)) System.out.println("hon");
        else if (pon.contains(ch)) System.out.println("pon");
        else if (bon.contains(ch)) System.out.println("bon");

    }

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
}
