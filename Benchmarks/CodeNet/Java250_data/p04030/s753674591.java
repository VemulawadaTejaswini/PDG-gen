import java.util.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;

public class Main {
    static class IO {
        BufferedReader br;
        StringTokenizer st;

        public IO() {
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

        int[] readarray(int sz) {
            int[] ret = new int[sz];
            for (int i = 0; i < sz; i++)
                ret[i] = nextInt();
            return ret;
        }
    }

    public static void main(String[] args) {
        IO fs = new IO();
        String s = fs.nextLine();
        Stack<Integer> st = new Stack<Integer>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0' || s.charAt(i) == '1') {
                st.push(s.charAt(i) - '0');
            } else {
                if (st.isEmpty())
                    continue;
                else
                    st.pop();
            }
        }
        ArrayList<Integer> ans = new ArrayList<Integer>();
        while(!st.empty()){
            ans.add(st.pop());
        }
        for(int i = ans.size()-1; i>=0; i--){
            System.out.print(ans.get(i));
        }
        System.out.println();
    }
}
