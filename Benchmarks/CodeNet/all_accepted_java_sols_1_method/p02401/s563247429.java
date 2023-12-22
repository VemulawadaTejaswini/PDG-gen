import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    boolean flg = true;

    List<Integer> result = new ArrayList<Integer>();

    List<Integer> list = new ArrayList<Integer>();
    List<String> op = new ArrayList<String>();
    while(flg) {
      for(int i = 0; i < 3; i++) {
        if (i == 1) {
          String str = sc.next();
          op.add(str);
          char[] c = str.toCharArray();
          if (str == null || c[0] == '?') {
            flg = false;
          }
        } else {
          int num = sc.nextInt();
          list.add(num);
        }
      }
    }
    sc.close();

    for(int j = 0; j < op.size(); j++) {
      switch(op.get(j)) {
        case "+":
          int ans = list.get(0) + list.get(1);
          result.add(ans);
          list.subList(0, 2).clear();
          // op.remove(0);
          break;
        case "-":
          int ans1 = list.get(0) - list.get(1);
          result.add(ans1);
          list.subList(0, 2).clear();
          // op.remove(0);
          break;
        case "*":
          int ans2 = list.get(0) * list.get(1);
          result.add(ans2);
          list.subList(0, 2).clear();
          // op.remove(0);
          break;
        case "/":
          int ans3 = list.get(0) / list.get(1);
          result.add(ans3);
          list.subList(0, 2).clear();
          // op.remove(0);
          break;
        case "?":
          break;
      }
    }

    for(int k = 0; k < result.size(); k++) {
      System.out.println(result.get(k));
    }
  }
}
