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

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Main {
    static PrintWriter out;
    static CF_Reader in;

    static int INTMAX = 2147483647;

    // Start: 大きな数
    // 10^20くらいまで
    // long a = 0;
    // End: 大きな数
    public static void main(String[] args) throws IOException {
        out = new PrintWriter(new OutputStreamWriter(System.out));
        in = new CF_Reader();
        StringBuilder result = new StringBuilder();

        long N = in.longNext();

        String[] alphabet = { "a", "b", "c", "d", "e", "f", "g",
          "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
          "u", "v", "w", "x", "y", "z" };
        String name = "";
        ArrayList<Long> amaris = new ArrayList<>();

        if (N <= 26) {
          name += alphabet[(int) N - 1];
          out.println(name);
          out.close();
          return;
        }

        while (N / 26 > 0) {
          amaris.add(N % 26);
          N = N / 26;
          while (N > 26) {
            long amari = N % 26;
            amaris.add(amari);
            N = N / 26;
          }
          name += alphabet[(int) N - 1];
        }

        Collections.reverse(amaris);
        if (amaris.get(amaris.size() - 1) == 0) {
          name = "";
          if (N - 2 >= 0) {
            name += alphabet[(int) N - 2];
          }
          for (long a : amaris) {
            name += "z";
          }
        } else {
          for (long a : amaris) {
            if (a > 0) {
              name += alphabet[(int) a - 1];
            } else {
              name += "z";
            }
          }
        }
        result.append(name);






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

        // Start: リストのリスト
        // @SuppressWarnings("unchecked")
        // List<Integer>[] adjacents = new ArrayList[N];
        // Start: リストのリスト

        out.println(result);

        out.close();
    }

    // public static 

    // 約数列挙
    // 使い方:
    // ArrayList<Integer> yakusuu = new ArrayList<>();
    // yakusuu = numeration(N);
    public static ArrayList<Integer> numeration (int N) {
        ArrayList<Integer> yakusuu = new ArrayList<>();

        ArrayList<Integer> leftYakusuu = new ArrayList<>();
        ArrayList<Integer> rightYakusuu = new ArrayList<>();

        for (int i = 1; i <= N/2; i++) {
          if (i > N / i) {
            break;
          }
          if (N % i == 0 && N / i != i) {
            leftYakusuu.add(i);
            rightYakusuu.add(N / i);
          }
          if (N % i == 0 && N / i == i) {
            leftYakusuu.add(i);
          }
        }
        yakusuu.addAll(leftYakusuu);
        Collections.reverse(rightYakusuu);
        yakusuu.addAll(rightYakusuu);
        return yakusuu;
    }

    public static ArrayList<Long> numeration (long N) {
        ArrayList<Long> yakusuu = new ArrayList<>();

        ArrayList<Long> leftYakusuu = new ArrayList<>();
        ArrayList<Long> rightYakusuu = new ArrayList<>();

        for (long i = 1; i <= N/2; i++) {
          if (i > N / i) {
            break;
          }
          if (N % i == 0 && N / i != i) {
            leftYakusuu.add(i);
            rightYakusuu.add(N / i);
          }
          if (N % i == 0 && N / i == i) {
            leftYakusuu.add(i);
          }
        }
        yakusuu.addAll(leftYakusuu);
        Collections.reverse(rightYakusuu);
        yakusuu.addAll(rightYakusuu);
        return yakusuu;
    }

    // 素数判定。
    public static boolean isPrime(int N) {
      if (N == 1) return false;
      for (int i = 2; i * i <= N; ++i) {
        if (N % i == 0) return false;
      }
      return true;
    }

    // 使い方
    // List<String> list = new ArrayList<String>();
    // permutation(list, "abc", "");
    // for (String str : list) {
    //   out.print(str + " ");
    // }
    // >> abc acb bac bca cab cba
    public static List<String> permutation(List<String> list, String target, String ans){
      if(target.length() <= 1) {
        list.add(ans + target);
      } else {
        for (int i = 0; i < target.length(); i++) {
          permutation(
            list,
            target.substring(0, i) + target.substring(i + 1),
            ans + target.charAt(i));
        }
      }
      return list;
    }

    // 使い方
    // String[] list2 = { "A", "B", "C", "D"};
    // List<String[]> res = combination(list2, 3);
    // for (String[] arr : res) {
    //   out.print("[");
    //   for (String a : arr) {
    //     out.print(a + ", ");
    //   }
    //   out.print("], ");
    // }
    // >> [A, B, C], [A, B, D], [A, C, D], [B, C, D]
    static List<String[]> combination(String[] data, int k) {
        List<String[]> result = new ArrayList<String[]>();
        combination(data, 0, new String[k], 0, result);
        return result;
    }

    static void combination(String[] data, int di, String[] comb, int ci, List<String[]> result) {
        if (ci == comb.length) {
            result.add(comb.clone());
            return;
        }
        for ( ; di <= data.length - (comb.length - ci); di++) {
            comb[ci] = data[di];
            combination(data, di + 1, comb, ci + 1, result);
        }
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

    public static boolean chmin(int[] dp, int i, int b) {
      if (dp[i] > b) {
        dp[i] = b;
        return true;
      }
      return false;
    }

    public static boolean chmax(int[] dp, int i, int b) {
      if (dp[i] < b) {
        dp[i] = b;
        return true;
      }
      return false;
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