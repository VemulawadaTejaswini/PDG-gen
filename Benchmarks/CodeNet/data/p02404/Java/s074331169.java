import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Objects;

public class Main{
    public static void main(String[] args){
        FastScanner sc = new FastScanner();

        while(true){
            int H = sc.nextInt();
            int W = sc.nextInt();
            if(H==0 && W==0)break;
            for(int i=0;i<W;i++)System.out.print("#");
            System.out.println();
            for(int i=1;i<H-1;i++){
                System.out.print("#");
                for(int j=1;j<W-1;j++)System.out.print(".");
                System.out.println("#");
            }
            for(int i=0;i<W;i++)System.out.print("#");
            System.out.println();
            System.out.println();
        }

    }

    public static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(String s) {
            try {
                br = new BufferedReader(new FileReader(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String nextToken() {
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
            return Integer.parseInt(nextToken());
        }

        long nextLong() {
            return Long.parseLong(nextToken());
        }

        double nextDouble() {
            return Double.parseDouble(nextToken());
        }
    }
}

