import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdInt = new Scanner(System.in);

  int j = 0;
  int[] ans = new int[1000];

    while (true) {
      String x;
      x = stdInt.next();
      int tmp=0;
      for (int i = 0; i < x.length(); i++) {
        tmp += x.charAt(i) - '0';
      }
      if (tmp == 0) break;
      ans[j++] = tmp;
    }

    for (int i = 0; i < j; i++) {
      System.out.println(ans[i]);
    }
  }
}
