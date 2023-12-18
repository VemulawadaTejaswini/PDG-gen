// This template is based on Mr. tonymontaro's template (https://atcoder.jp/users/tonymontaro).
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

// For flatten() required Java8
import java.util.stream.Stream;
import java.util.stream.IntStream;

import java.util.Queue;
import java.util.ArrayDeque;

public class Main {
    static PrintWriter out;
    static CF_Reader in;

    public static void main(String[] args) throws IOException {
        out = new PrintWriter(new OutputStreamWriter(System.out));
        in = new CF_Reader();
        StringBuilder result = new StringBuilder();

        // Start: int型の整数N Mを取得する
        // // N M 形式
        int N = in.intNext();
        int M = in.intNext();

        // int[] rooms = new [N];

        int[][] adjacents = new int[N][N];

        for (int i = 0; i < M; i++) {
          int A = in.intNext();
          int B = in.intNext();
          adjacents[A - 1][B - 1] = 1;
          adjacents[B - 1][A - 1] = 1;
        }

        // int[] dist = new int[N];
        // for (int i = 0; i < N; i++) {
        //   dist[i] = -1;
        // }
        // dist[0] = 0;

        // Queue<Integer> queue = new ArrayDeque<Integer>();
        // queue.add(0);

        // while(!queue.isEmpty()) {
        //   int currentRoom = queue.poll();
        //   for (int i = 0; i < N; i++) {
        //     if (dist[i] == -1 && adjacents[currentRoom][i] == 1) {
        //       queue.add(i);
        //       dist[i] = currentRoom;
        //     }
        //   }
        // }

        // boolean existenceFlag = true;
        // for (int i = 1; i < N; i++) {
        //   if (dist[i] == -1) {
        //     existenceFlag = false;
        //     break;
        //   }
        // }

        out.println("Yes");
        for (int i = 1; i < N; i++) {
          out.println(dist[i] + 1);
        }

        // if (existenceFlag) {
        //   out.println("Yes");
        //   for (int i = 1; i < N; i++) {
        //     out.println(dist[i] + 1);
        //   }
        // } else {
        //   out.println("No");
        // }

        //[補足]
        // N M
        // A B 形式だと
        // int N = in.intNext();
        // int M = in.intNext();
        // int A = in.intNext();
        // int B = in.intNext();
        // End: int型の整数N Mを取得する

        // Start: int型の整数Nと配列Aを取得する
        // // N
        // // A1 A2 A3... AN 形式
        // int n = in.intNext();
        // int[] A = in.nextIntArray(n);
        // End: int型の整数Nと配列Aを取得する

        // Start: Char型の文字をInt型に変換する
        // Integer.parseInt(String.valueOf(charText))
        // End: Char型の文字をInt型に変換する

        // Start: 文字列を1文字ずつ出力する
        // String text = in.next();
        // char[] work = new char[text.length()];
        // for(int i = 0; i < text.length(); i++){
        //   work[i] = text.charAt(i); // Char型の文字
        //   out.println(work[i]);
        // }
        // End: 文字列を1文字ずつ出力する

        // Start: 配列の定義
        // int[] a = new int[N];
        // int[][] b = new int[N][M];
        // End: 配列の定義

        // Start: キューの定義
        // Queue<int[]> queue = new ArrayDeque<int[]>();
        // Start: キューの定義

        // out.println(result);

        out.close();
    }

    public static int[] flatten(int[][] arr) {
       return Stream.of(arr)
          .flatMapToInt(row -> IntStream.of(row))
          .toArray();
    }

    public static int maxIntValueFromArray(int[] array) {

        int intMax = array[0];

        for (int i = 1; i < array.length; i++ ) {
            if(intMax < array[i]) {
                intMax = array[i];
            }
        }
        return intMax;
    }

    public static int minIntValueFromArray(int[] array) {

        int intMin = array[0];

        for (int i = 1; i < array.length; i++ ) {
            if(intMin > array[i]) {
                intMin = array[i];
            }
        }
        return intMin;
    }

    static class CF_Reader {
        BufferedReader br;
        StringTokenizer st;

        public CF_Reader() throws IOException {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine().trim());
            return st.nextToken();
        }

        long longNext() throws IOException {
            return Long.parseLong(next());
        }

        int intNext() throws IOException {
            return Integer.parseInt(next());
        }

        double doubleNext() throws IOException {
            return Double.parseDouble(next());
        }

        char charNext() throws IOException {
            return next().charAt(0);
        }

        public int[] nextIntArray(final int n) throws IOException {
            final int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = intNext();
            return a;
        }

        public long[] nextLongArray(final int n) throws IOException {
            final long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = longNext();
            return a;
        }

        String line() throws IOException {
            return br.readLine().trim();
        }
    }
}