import java.awt.Frame;
import java.awt.image.SinglePixelPackedSampleModel;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

import javax.print.attribute.standard.Chromaticity;
import javax.sql.rowset.FilteredRowSet;
import javax.swing.BorderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.stream.events.EndDocument;
import javax.xml.transform.Templates;

import java.math.BigInteger;
import java.time.chrono.MinguoChronology;
import java.util.Scanner;

public class Main {
  static InputReader in;
  static PrintWriter out;
  
  static class Solution {
    void solve() throws IOException {
      int N = in.nextInt();
      int cnt;
      int[] A = new int[N];
      for (int i = 0; i < N; i++) {
        A[i] = in.nextInt();
      }
      
      cnt = bubbleSort(A, N);
      
      for (int i = 0; i < N; i++) {
        out.print(A[i]);
        if (i != N - 1) {          
          out.print(" ");
        } else {
          out.print("\n");
        }
      }
      
      out.println(cnt);
//      End solve()
    }
    
    int bubbleSort(int[] A, int N) {
      int cnt = 0;
      
      boolean flg = true;
      while (flg) {
        flg = false;
        for (int i = N - 1; i > 0; i--) {
          if (A[i] < A[i - 1]) {
            int tmp = A[i];
            A[i] = A[i - 1];
            A[i - 1] = tmp;
            
            cnt++;
            flg = true;
          }
        }
        
      }
      return cnt;
    }
    
//  End solution
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