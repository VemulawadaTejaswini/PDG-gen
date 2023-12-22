import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next(), week[] = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
    for (int i = 0; i < 7; i++)
      if (S.equals(week[i])) System.out.println(7 - i);
  }
}