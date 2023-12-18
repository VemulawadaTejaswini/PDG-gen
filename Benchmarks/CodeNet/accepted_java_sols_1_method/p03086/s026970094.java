import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int count =0,max =0;
    for (int i=0; i<S.length(); i++) {
      if (S.charAt(i) == 'A' ||S.charAt(i) == 'T' ||S.charAt(i) == 'G' ||S.charAt(i) == 'C') {
        count++;
      } else {
        max = Math.max(count,max);
        count =0;
      }
      max = Math.max(count,max);
    }
    System.out.println(max);
  }
}