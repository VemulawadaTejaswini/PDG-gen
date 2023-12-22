import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String S = scan.nextLine();

    int count = 0;
    char pre = 0;
    for (int i = 0; i < S.length(); i++) {
      if (i == 0) {
        pre = S.charAt(i);
        continue;
      }
      if (pre == '0') {
        if (S.charAt(i) != '1') {
          count++;
        }
        pre = '1';
      } else {
        if (S.charAt(i) != '0') {
          count++;
        }
        pre = '0';
      }
    }

    System.out.println(count);
  }
}
