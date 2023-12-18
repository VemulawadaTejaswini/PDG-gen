import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();

    sc.close();

    int count = 0;

    for (int i = 1; i <= N; i++) {
      String s = String.valueOf(i);
      String[] S = s.split("");
      int k = 0;
      for (int j = 0; j < S.length; j++) {
        k += Integer.valueOf(S[j]);
      }
      if (A <= k && k <= B) {
        count += i;
      }
    }

    System.out.println(count);

  }

}