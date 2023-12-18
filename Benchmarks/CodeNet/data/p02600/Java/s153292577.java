import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        MyScanner scn = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        // Solution Start
        int t = scn.nextInt();
        if (t > 1800) out.println("1");
        else if (t > 1600) out.println("2");
        else if (t > 1400) out.println("3");
        else if (t > 1200) out.println("4");
        else if (t > 1000) out.println("5");
        else if (t > 800) out.println("6");
        else if (t > 600) out.println("7");
        else out.println("8");
        //Solution end
        out.close();
    }


    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;

    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
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
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
    //--------------------------------------------------------
}
