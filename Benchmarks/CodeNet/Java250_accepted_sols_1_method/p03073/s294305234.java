import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S[] = sc.next().split("");
    String a = "1";
    String b = "0";
    int countA = 0;
    int countB = 0;
    for (String s : S) {
      if (s.equals(a)) {
        countA++;	
      }
      if (s.equals(b)) {
        countB++;
      }
      String t = a;
      a = b;
      b = t;
    }
    System.out.println(Math.min(countA,countB));
  }
}