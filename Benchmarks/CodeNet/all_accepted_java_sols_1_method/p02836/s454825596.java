import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();

    int count = 0;
    for (int i = 0; i < S.length()/2 ; i++) {
      if (S.charAt(i) != S.charAt(S.length() - i - 1)) {
        count++;
      }
    }

    System.out.println(count);
  }
}
