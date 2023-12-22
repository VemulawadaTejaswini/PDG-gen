import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      char[] S = sc.next().toCharArray();
      int result = 0;
      for (int i = 0; i < S.length; i++) {
        if (S[i] == '+') {
          result++;
        } else {
          result--;
        }
      }

      System.out.println(result);
    }
  }
}
