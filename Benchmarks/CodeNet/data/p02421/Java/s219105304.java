import java.awt.Frame;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import javax.sql.rowset.FilteredRowSet;
import javax.swing.BorderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.stream.events.EndDocument;
import java.math.BigInteger;
import java.time.chrono.MinguoChronology;
import java.util.Scanner;

public class Main {
  static InputReader in;
  static PrintWriter out;
  
  static class Solution {
    void solve() throws IOException {
      int n = in.nextInt();
      int taropoint = 0;
      int hanakopoint = 0;
      String tarocard;
      String hanakocard;
      
      for (int i = 0; i < n; i++) {
        tarocard = in.next();
        hanakocard = in.next();
        
        if (!tarocard.equals(hanakocard)) {   
            for (int j = 0, min = Math.min(tarocard.length(), hanakocard.length());  j < min; j++) {
              if (tarocard.charAt(j) > hanakocard.charAt(j)) {
                taropoint += 3;
                break;
              } else if (tarocard.charAt(j) < hanakocard.charAt(j)){
                hanakopoint += 3;
                break;
              }
            
              if (j == min - 1) {
                if (min == tarocard.length()) {
                  hanakopoint +=3;
                  break;
                } 
                taropoint += 3;
              }
            }
        } else {
          taropoint++;
          hanakopoint++;
        }
      }
      
      out.println(taropoint + " " + hanakopoint);
      
//      End solve()
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