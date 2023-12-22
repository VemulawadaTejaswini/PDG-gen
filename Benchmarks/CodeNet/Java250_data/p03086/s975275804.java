import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    String str = scan.next();
    int max = 0;

    for (int i = 0; i < str.length();) {
      int cnt = 0;
      for (int j = i; j < str.length(); j++) {
        i = j + 1;
        if ((str.charAt(j) == 'A') || (str.charAt(j) == 'C') || (str.charAt(j) == 'G') || (str.charAt(j) == 'T')) {
          cnt++;
        } else {
          break;
        }
      }
      max = Math.max(max, cnt);
    }

    System.out.println(max);
  }

}