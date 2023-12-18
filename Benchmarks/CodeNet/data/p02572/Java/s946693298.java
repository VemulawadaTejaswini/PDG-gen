import java.io.*;
import java.util.*;

import static java.lang.Integer.*;
import static java.lang.Long.parseLong;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter prnt = new PrintWriter(System.out);
        StringTokenizer st;
        int N = parseInt(read.readLine());
        long[] arr = new long[N];
        st = new StringTokenizer(read.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = parseLong(st.nextToken());
        }
        prnt.println(getSum(arr,N));
        prnt.close();
    }

    static long getSum(long[] arr, int N) {
        long Sum = 0;
        long mod = (long) (1e9 + 7);
        for (int i = 0; i < (N - 1); i++) {
            for (int j = i + 1; j < N; j++) {
                long multiple = (arr[i] * arr[j]) % mod;
                Sum += multiple;
                Sum = Sum % mod;
            }
        }
        return Sum;
    }
}