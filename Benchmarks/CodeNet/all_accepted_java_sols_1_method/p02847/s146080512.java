import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    sc.close();
    String A[] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
    for (int i = 0; i < A.length; i++) {
      if (S.equals(A[i])) {
        System.out.println(7 - i);
        break;
      }
    }

  }
}
