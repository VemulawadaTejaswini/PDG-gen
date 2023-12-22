import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in);) {
      int n = sc.nextInt();
      int m = sc.nextInt();

      sc.nextLine();

      String[] results = new String[n];
      for (int i = 0; i < n; i++) {
        results[i] = sc.nextLine().substring(2);
      }

      int sum = 0;
      for (int i = 1; i <= m; i++) {
        if (hasElem(results, i)) {
          sum++;
        }
      }

      System.out.println(sum);
    }
  }

  private static boolean hasElem(String[] results, int num) {
    for (String result : results) {
      String[] elems = result.split(" ");
      if (hasWord(elems, num) == false) {
        return false;
      }
    }
    return true;
  }

  private static boolean hasWord(String[] words, int num) {
    for (String word : words) {
      if (word.equals(String.valueOf(num))) {
        return true;
      }
    }
    return false;
  }
}