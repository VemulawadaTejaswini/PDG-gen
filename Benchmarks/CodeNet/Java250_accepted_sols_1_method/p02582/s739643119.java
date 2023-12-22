import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] s = sc.next().toCharArray();
    int tmp = 0;
    int ans = 0;
    for (char ss : s) {
      if (ss == 'R') {
        tmp++;
      } else {
        tmp = 0;
      }
      ans = Math.max(tmp, ans);
    }
    System.out.println(ans);
    sc.close();
  }
}
