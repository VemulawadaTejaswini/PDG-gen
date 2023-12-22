import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
  private static PrintWriter out;

  public static void main(String[] args) {
    Main main = new Main();
    try {
      main.run(args);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void run(String[] arguments) throws Exception {
    MyScanner sc = new MyScanner();
    out = new PrintWriter(new BufferedOutputStream(System.out));

    ArrayList<String> arrayWordList = new ArrayList<>();
    int n = sc.nextInt();
    String ans = "Yes";

    for (int i = 0; i < n; i++) {
      String word = sc.next();
      if (arrayWordList.contains(word)) {
        ans = "No";
        break;
      }
      if (i > 0) {
        String beforeWord = arrayWordList.get(i - 1);
        char beforeLastChar = beforeWord.toCharArray()[beforeWord.length() - 1];
        char thisFirstChar = word.toCharArray()[0];
        if (beforeLastChar != thisFirstChar) {
          ans = "No";
          break;
        }
      }
      arrayWordList.add(word);
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
