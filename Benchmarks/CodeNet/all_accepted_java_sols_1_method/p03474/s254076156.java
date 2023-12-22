import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();
    String s = sc.next();

    sc.close();

    String[] S = s.split("");

    String result = "Yes";

    for (int i = 0; i < S.length; i++) {

      if (S.length != A + B + 1) {
        result = "No";
        break;
      }

      if (i == A && !S[i].equals("-")) {
        result = "No";
        break;
      }

      if (i < A || A < i) {
        if (!S[i].equals("-")) {
          int n_ = Integer.valueOf(S[i]);
          if (n_ < 0 || 9 < n_) {
            result = "No";
            break;
          }
        } else {
          result = "No";
          break;
        }
      }

    }

    System.out.println(result);
  
  }

}