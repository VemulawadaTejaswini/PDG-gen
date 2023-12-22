import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder sb = new StringBuilder();
    String[] str = sc.nextLine().split("");
    String p = sc.nextLine();
    for(int i = 0; i < str.length; i++) {
      sb.setLength(0);
      for(int j = i; j < i + str.length; j++) {
        int a = j;
        if(a >= str.length) {
          a -= str.length;
        }
        sb.append(str[a]);
      }
      String s = sb.toString();
      if(s.contains(p)) {
        System.out.println("Yes");
        break;
      } else if(i == str.length - 1) {
        System.out.println("No");
      }
    }
  }
}

