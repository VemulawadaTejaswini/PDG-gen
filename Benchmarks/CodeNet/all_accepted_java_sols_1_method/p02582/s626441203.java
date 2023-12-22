import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ans = 0;
    int tmpAns = 0;
    char[] s = sc.nextLine().toCharArray();
    for (int cnt = 0; cnt < 3; cnt++) {
      if (s[cnt] == 'R') {
        tmpAns++;
      }
      if (s[cnt] == 'S' || cnt == 2) {
        ans = Math.max(tmpAns, ans);
        tmpAns = 0;
      }
    }
    System.out.println(ans + "");
    sc.close();
  }
}
