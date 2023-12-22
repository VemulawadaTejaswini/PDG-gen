import java.util.*;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int maxCount = 0, count = 0;
    for (int i = 0; i < S.length(); i++) {
      if (S.charAt(i) == 'A' || S.charAt(i) == 'T' || S.charAt(i) == 'G' || S.charAt(i) == 'C') {
        count++;
        if (count > maxCount) {
            maxCount = count;
        }
      }
      else count = 0;
    }
    System.out.println(maxCount);
  }
}
