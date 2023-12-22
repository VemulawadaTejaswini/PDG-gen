import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] alp = new int[26];
    String s = sc.next();
    int cnt = 0;

    for (int i = 0; i < 4; i++) {
      alp[s.charAt(i) - 'A']++;
    }

    for (int i = 0; i < 26; i++) {
      if (alp[i] == 0) {
        continue;
      } else if (alp[i] == 2) {
        cnt++;
      } else {
        System.out.println("No");
        return;
      }
    }

    if (cnt == 2) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}