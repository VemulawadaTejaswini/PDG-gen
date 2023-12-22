import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    sc.close();

    String[] S = s.split("");

    // 0101...にした場合
    int count1 = 0;

    // 1010...にした場合
    int count2 = 0;

    for (int i = 0; i < S.length; i++) {
      if (i % 2 == 0) {
        if (S[i].equals("1")) {
          count1++;
        } else {
          count2++;
        }
      } else { 
        if (S[i].equals("0")) {
          count1++;
        } else {
          count2++;
        }
      }
    }

    System.out.println(Math.min(count1, count2));

  }

}