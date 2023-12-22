import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    String S = in.readLine();
    String T = in.readLine();

    System.out.println(solve(S, T));

    in.close();
  }

  private static int solve(String S, String T) {
    int maxNumCommonChars = 0;

    for (int i = 0; i + T.length() <= S.length(); ++i) {
      maxNumCommonChars = Math.max(maxNumCommonChars, getNumCommonChars(S, T, i));
    }

    return T.length() - maxNumCommonChars;
  }

  private static int getNumCommonChars(String S, String T, int start) {
    int numCommonChars = 0;

    for (int i = 0; i < T.length(); ++i) {
      if (S.charAt(start + i) == T.charAt(i)) {
        numCommonChars++;
      }
    }

    return numCommonChars;
  }
}