import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    while (!(s.equals("."))) {
      //初期入力・処理
      List<Character> list = new ArrayList<Character>();
      boolean flag = true;

      //判別処理
      for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        int r = list.size() - 1;
        if (c == '(' || c == '[') {
          list.add(c);
        } else if (c == ')' || c == ']') {
          if (r < 0) {// list長が0のとき
            flag = false;
            break;
          }
          if ((list.get(r) == '(' && c == ')') || (list.get(r) == '[' && c == ']')) {// 同じ括弧
            list.remove(r);
          } else if ((list.get(r) == '[' && c == ')') || (list.get(r) == '(' && c == ']')) {// 異なる括弧
            flag = false;
            break;
          }
        }
      }
      if (list.size() != 0) flag = false;

      //出力処理
      if (flag) {// バランスが成り立ってるか出力
        System.out.println("yes");
      } else {
        System.out.println("no");
      }

      s = sc.nextLine();
    }
  }
}

