import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = Integer.parseInt(stdIn.next());
    String s = stdIn.next();
    String t = stdIn.next();

    String[] sChar = s.split("", n);
    String[] tChar = t.split("", n);

    for (int i = 0; i < n; i++) {
      System.out.print(sChar[i] + tChar[i]);
    }
    System.out.println();
  }
}
