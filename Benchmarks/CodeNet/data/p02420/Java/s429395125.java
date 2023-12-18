import java.util.Random;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Random rand = new Random();
    Scanner stdIn = new Scanner(System.in);

    String[] ans = new String[10];
    int x = 0;
    while (true) {
      String str = stdIn.next();
      if (str.equals("-"))
      break;
      int m = stdIn.nextInt();
      for (int i = 0; i < m; i++) {
        int h = stdIn.nextInt();
        int size = str.length();
        String tmp1 = str.substring(h, size);
        String tmp2 = str.substring(0, h);
        str = tmp1 + tmp2;
      }
      ans[x++] = str;
    }

    for (int i = 0; i < x; i++) {
      System.out.println(ans[i]);
    }
  }
}
