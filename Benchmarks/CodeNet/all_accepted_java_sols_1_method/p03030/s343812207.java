import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    String[] s = new String[N];

    for (int i = 0; i < N; i++) {
      String s_ = sc.next();
      int n_ = sc.nextInt();
      int distance = 100 - n_;
      s_ = s_ + "/" + String.format("%03d", distance) + "/" + String.format("%03d", i);
      s[i] = s_;
    }

    sc.close();

    Arrays.sort(s);

    for (int i = 0; i < N; i++) {
      String[] r = s[i].split("/");
      System.out.println(Integer.valueOf(r[2]) + 1);
    }

  }

}