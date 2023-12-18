import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    String[] S = new String[N];

    for (int i = 0; i < N; i++) {
      S[i] = sc.next() + "/" + (1100 - sc.nextInt() + "/" + (i + 1));
    }

    sc.close();

    Arrays.sort(S);

    for (int i = 0; i < N; i++) {
      String[] s_ = S[i].split("/");
      System.out.println(s_[2]);
    }

  }

}