import java.io.*;
import java.util.StringTokenizer;

public class Main {
  private static PrintWriter out;

  public static void main(String[] args) {
    Main main = new Main();
    Runtime.getRuntime().addShutdownHook(new Thread(() -> out.close()));
    try {
      main.run(args);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void run(String[] arguments) throws Exception {
    MyScanner sc = new MyScanner();
    out = new PrintWriter(new BufferedOutputStream(System.out));

    int x = sc.nextInt();
    int y = sc.nextInt();
    String ans = "No";

    for (int i = 0; i < 51; i++) {
      for (int j = 0; j < 26; j++) {
        int turuTotal = i *2;
        int kameTotal = j * 4;
        int total = turuTotal + kameTotal;
        if (total==y && (i+j)==x){
          ans = "Yes";
          break;
        }
      }
    }
    out.println(ans);
    out.close();
  }

  /*          
   * Form: http://codeforces.com/blog/entry/7018
   */
  private class MyScanner {
    BufferedReader br;
    StringTokenizer st;

    MyScanner() {
      br = new BufferedReader(new InputStreamReader(System.in));
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
}
