import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Integer N = sc.nextInt();
    String S = sc.next();

    for (int i = 0; i < S.length(); i++) {
      char s = S.charAt(i);
      System.out.print((char)('A' + (s - 'A' + N) % 26));
    }
    System.out.println();
  }
}