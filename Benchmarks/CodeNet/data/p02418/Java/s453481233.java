import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;


public class Main {
        public static void main(String[] args) {
        FastReader f = new FastReader();
        HashMap<Integer,Integer> histogram = new HashMap<>();
        // fill in the dictionary with the initial value
        String match = "No";
        String s = f.nextLine();
        String p = f.nextLine();
        int size = p.length();
        int len = s.length();
        for(int i = 0; i < len; i++){
            int endOne = i+size;
            int endTwo = 0;
            if(endOne >= len){
                 endTwo = endOne % len;
                 endOne = len;
            }
            String result = s.substring(i, endOne) + s.substring(0,endTwo);
            if(result.equals(p)){
                match = "Yes";
                break;
            }

        }

        System.out.println(match);
    }

    // Helper class to speed up IO
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader() {
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

