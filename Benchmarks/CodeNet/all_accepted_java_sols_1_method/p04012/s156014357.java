import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] w = sc.next().toCharArray();
    int[] t = new int[26];

    for (int i = 0; i < w.length; ++i) {
      ++t[w[i] - 97];
    }
    for (int i = 0; i < 26; ++i) {
      if (t[i] % 2 != 0) {
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }
}
