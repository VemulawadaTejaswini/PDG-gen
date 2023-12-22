import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.next());
    String[] s = new String[n];
    char[][] c = new char[n][26];

    for (int i = 0; i < n; i++) {
      s[i] = sc.next();
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < s[i].length(); j++) {
        for (int k = 0; k < 26; k++) {
          if (s[i].charAt(j) == 97 + k) {
            c[i][k]++;
          }
        }
      }
    }

    int[] num = new int[26];

    for (int i = 0; i < 26; i++) {
      num[i] = 100;
      for (int j = 0; j < n; j++) {
        num[i] = Math.min(num[i], c[j][i]);
      }
    }

    for (int i = 0; i < 26; i++) {
      for (int j = 0; j < num[i]; j++) {
        System.out.print((char) (i + 'a'));
      }
    }

    System.out.println();

    sc.close();
  }
}
