import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    ArrayList<Character> xl = new ArrayList<Character>();
    ArrayList<Character> yl = new ArrayList<Character>();
    ArrayList<Character> cl = new ArrayList<Character>();
    int max = 0;

    for (int i = 0; i < n; i++) {
      yl.add(s.charAt(i));
    }

    for (int i = 0; i < (n - 1); i++) {
      int cnt = 0;
      xl.add(s.charAt(i));
      yl.remove(0);
      cl.clear();

      for (char c : xl) {
        if (yl.contains(c) && !cl.contains(c)) {
          cnt++;
          cl.add(c);
        }
      }

      max = Math.max(cnt, max);
    }

    System.out.println(max);

  }
}