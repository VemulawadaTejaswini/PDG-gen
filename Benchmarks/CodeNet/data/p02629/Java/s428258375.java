import java.util.*;
import java.io.*;

public class Main {
    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int input = nextInt();
        int tempInput = input;
        int temp = 0;
        int powerOf26 = 1;
        while (tempInput>temp) {
            temp += Math.pow(26, powerOf26);
            tempInput-=temp;
            powerOf26++;
        }

        int [] digits = new int [powerOf26];
        for (int x=powerOf26-1; x>=0; x--) {
            digits[x] = input / (int) Math.pow(26, x);
            input %= (int) Math.pow(26, x);
            if (digits[x]!=0)
                System.out.print((char)(digits[x]-1+'a'));
        }
    }
    
    public static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
    public static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public static double nextDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }
}


