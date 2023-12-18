import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count[] = new int[200];
    String s;
    char c;

    while (sc.hasNext()) {
      s = sc.nextLine().toLowerCase();
      for (int i = 0; i < s.length(); i++) {
        count[s.charAt(i)]++;
      }
    }

    for (int i = 'a'; i <= 'z'; i++) {
      System.out.printf("%c : %d\n", i, count[i]);
    }

    sc.close();
  }
}

/*
A:65
Z:90
a:97
z:122
*/

