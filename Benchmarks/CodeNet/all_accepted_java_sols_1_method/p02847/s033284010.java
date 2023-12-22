import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    int ans = 0;
    for (int i = 0; i < week.length; i++) {
      if (s.equals(week[i])) {
        ans = 7 - i;
        break;
      }
    }

    System.out.println(ans);
  }
}
