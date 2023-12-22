import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
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

    static <T> void printArray(T[] arr) {
        for (T x : arr)
            print(x, " ");
        printn("");
    }

    static <T> void print(T s, String sep) {
        System.out.print(s + sep);
    }

    static <T> void printn(T s) {
        System.out.println(s);
    }

    static Long[] inputArrL(int n, FastReader fr) {
        Long[] arr = new Long[n];
        for (int i = 0; i < n; i++)
            arr[i] = fr.nextLong();
        return arr;
    }

    static Integer[] inputArr(int n, FastReader fr) {
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++)
            arr[i] = fr.nextInt();
        return arr;
    }

    static int maxValue(Integer[] arr, int idx, int f, int[][] dp) {
        int res = 0;
        if (idx == arr.length)
            return 0;
        if (dp[idx][f] != -1)
            return dp[idx][f];
        if (f == 2) {
            if (arr[idx] == 0)
                res = Math.max(1 + maxValue(arr, idx + 1, 1, dp), maxValue(arr, idx + 1, f, dp));
            else
                res = Math.max(1 + maxValue(arr, idx + 1, f, dp), maxValue(arr, idx + 1, 1, dp));
        } else if (f == 1)
            res = Math.max(1 - arr[idx] + maxValue(arr, idx + 1, f, dp), arr[idx] + maxValue(arr, idx + 1, 0, dp));
        else
            res = arr[idx] + maxValue(arr, idx + 1, f, dp);
        return res;
    }

    static int max(int... args) {
        int max = Integer.MIN_VALUE;
        for (int x : args) {
            max = Math.max(x, max);
        }
        return max;
    }

    static int min(int... args) {
        int min = Integer.MAX_VALUE;
        for (int x : args) {
            min = Math.min(x, min);
        }
        return min;
    }

	public static void main(String[] args) {
		FastReader fr = new FastReader();
		int a;
		a = fr.nextInt();
		String s = fr.nextLine();
		int count = 0;
		for(int i=0; i<a-2; i++){
			if(s.substring(i, i+3).compareTo("ABC") == 0)
				count += 1;
		}
		printn(count);
	}
}
