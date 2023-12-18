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

        boolean[][] isExist = new boolean[4][13];
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            String suit = sc.nextToken();
            int num = sc.nextInt();
            if(suit.equals("S"))isExist[0][num-1] = true;
            else if(suit.equals("H"))isExist[1][num-1] = true;
            else if(suit.equals("C"))isExist[2][num-1] = true;
            else if(suit.equals("D"))isExist[3][num-1] = true;
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<13;j++){
                if(!isExist[i][j]){
                    if(i==0)System.out.println("S "+(j+1));
                    else if(i==1)System.out.println("H "+(j+1));
                    else if(i==2)System.out.println("C "+(j+1));
                    else if(i==3)System.out.println("D "+(j+1));
                }
            }
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

