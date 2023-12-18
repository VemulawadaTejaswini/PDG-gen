import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    String[] S = new String[N];
    int[] P = new int[N];


    for (int i = 0; i < N; i++) {
      String s = sc.next();
      P[i] = sc.nextInt();
      String p_ = String.format("%03d", 100 - P[i]);
      String i_ = String.format("%03d", i);
      S[i] = s + "_" + p_ +  "_" + i_;
    }

    sc.close();

    Arrays.sort(S);

    for (int i = 0; i < N; i++) {
      String[] s_ = S[i].split("_");
      System.out.println(Integer.valueOf(s_[2]) + 1);
    }

  }

}