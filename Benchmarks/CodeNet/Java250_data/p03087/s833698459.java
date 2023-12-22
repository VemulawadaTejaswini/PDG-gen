import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int q = sc.nextInt();

    String str = sc.next();
    String[] strList = str.split("");

    int[] t = new int[n + 1];
    for (int i = 1; i < n; i++) {
      if(strList[i-1].equals("A") && strList[i].equals("C")) {
        t[i + 1] = t[i] + 1;
      } else {
        t[i + 1] = t[i];
      }
    }

    for (int i = 0; i < q; i++) {
      int start = sc.nextInt();
      int end = sc.nextInt();
      System.out.println(t[end] - t[start]);
    }
  }
}
