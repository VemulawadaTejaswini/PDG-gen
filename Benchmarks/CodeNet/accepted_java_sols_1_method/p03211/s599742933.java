import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();

    int min = 753;
    for (int i = 0; i <= S.length()-3; i++) {
      int a = Integer.parseInt(S.substring(i, i+3));
      int diff = Math.abs(753-a);
      if (diff < min) {
        min = diff;
      }
    }
    System.out.println(min);
  }
}