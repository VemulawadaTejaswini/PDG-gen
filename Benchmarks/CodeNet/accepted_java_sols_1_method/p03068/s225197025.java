import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      char[] S = in.next().toCharArray();
      int K = in.nextInt();
      
      for (int i = 0; i < S.length; ++i) {
        if (S[i] != S[K -1]) {
          S[i] = '*';
        }
      }

      System.out.println(S);
    }
  }
}