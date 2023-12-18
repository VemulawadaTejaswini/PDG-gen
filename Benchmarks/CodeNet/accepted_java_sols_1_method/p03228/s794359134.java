import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int k = sc.nextInt();
    int jibun = a;
    int aite = b;
    int tmp = -1;
    for (int i = 0; i < k; i++) {
      if (jibun % 2 == 1) {
        jibun--;
      }
      aite += (jibun / 2);
      jibun /= 2;
      tmp = jibun;
      jibun = aite;
      aite = tmp;
    }
    if (k % 2 == 0) {
      System.out.println(jibun + " " + aite);
    } else {
      System.out.println(aite + " " + jibun);
    }
  }
}
