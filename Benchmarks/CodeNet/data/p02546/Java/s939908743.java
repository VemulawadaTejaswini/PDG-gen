import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
  String YES = "YES", NO= "NO";
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int i =  s.lastIndexOf("s");
    if(i == s.length()-1){
      System.out.println(s + "es");
    }
    else{
      System.out.println(s +"s");
    }
  }

  static class Scanner {
    StringTokenizer st;
    BufferedReader br;

    public Scanner(InputStream s) {
      br = new BufferedReader(new InputStreamReader(s));
    }

    public Scanner(FileReader s) throws FileNotFoundException {
      br = new BufferedReader(s);
    }

    public String next() throws IOException {
      while (st == null || !st.hasMoreTokens())
        st = new StringTokenizer(br.readLine());
      return st.nextToken();
    }

    public int nextInt() throws IOException {
      return Integer.parseInt(next());
    }

    public long nextLong() throws IOException {
      return Long.parseLong(next());
    }

    public String nextLine() throws IOException {
      return br.readLine();
    }

    public double nextDouble() throws IOException {
      return Double.parseDouble(next());
    }

    public boolean ready() throws IOException {
      return br.ready();
    }
  }
}