import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String w = sc.next();
    w = w.toLowerCase();
    int cnt = 0;
    while(true) {
      String t = sc.next();
      if (t.equals("END_OF_TEXT")) break;
      t = t.toLowerCase();
      if (t.equals(w)) cnt++;
    }
    System.out.println(cnt);
  }
}
