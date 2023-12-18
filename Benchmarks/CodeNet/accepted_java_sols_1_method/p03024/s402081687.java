import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String S =  scan.nextLine();
    int maru = 0;
    int batsu = 0;
    int sum = 0;
    for (int i = 0; i < S.length(); i++) {
      sum++;
      if (S.charAt(i) == 'o') {
        maru++;
      } else {
        batsu++;
      }
    }
    if (batsu >= 8) {
      System.out.println("NO");
    } else {
      System.out.println("YES");
    }

  }
}
