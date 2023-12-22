import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.math.BigDecimal;

public class Main {
  static InputReader in;
  static PrintWriter out;

  static class Solution {
    void solve() throws IOException {
      int N = in.nextInt();
      int[] A = new int[N];
      for (int i = 0; i < N; i++) {
        A[i] = in.nextInt();
        out.print(A[i]);
        if (i != N - 1) {
            out.print(" ");
          } else {
            out.print("\n");
          }
      }
      
      insertionSort(A, N);
     
//      End solve()
    }
    
    void insertionSort(int[] A, int N) {
      for (int i = 1; i < N; i++) {
        int v = A[i];
        int j = i - 1; 
        while (j >= 0 && A[j] > v) {
          A[j+1] = A[j];
          j--;
        }
        A[j+1] = v;
        
        for (int k = 0; k < N; k++) {
          out.print(A[k]);
          if (k != N - 1) {
            out.print(" ");
          } else {
            out.print("\n");
          }
        }
      }
    
    }
//    End Solution
}


  public static void main(String[] args) throws IOException {
    in = new InputReader(System.in);
    out = new PrintWriter(System.out);
    Solution solver = new Solution();
    solver.solve();
    out.close();
}


  static class InputReader {
    public BufferedReader br;
    public StringTokenizer st;

    public InputReader(InputStream stream) {
      br = new BufferedReader(new InputStreamReader(stream));
    }

    public int nextInt() throws IOException {
      while (st == null || !st.hasMoreTokens()) {
        st = new StringTokenizer(br.readLine());
      }
      return Integer.parseInt(st.nextToken());
    }

    public long nextLong() throws IOException {
      while (st == null || !st.hasMoreTokens()) {
        st = new StringTokenizer(br.readLine());
      }
      return Long.parseLong(st.nextToken());
    }

    public String next() throws IOException {
      while (st == null || !st.hasMoreTokens()) {
        st = new StringTokenizer(br.readLine());
      }
      return st.nextToken();
    }

    public double nextDouble() throws IOException {
      while (st == null || !st.hasMoreTokens()) {
        st = new StringTokenizer(br.readLine());
      }
      return Double.parseDouble(st.nextToken());
    }

  }

}