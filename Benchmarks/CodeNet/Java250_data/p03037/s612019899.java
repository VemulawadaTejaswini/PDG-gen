import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] l = new int[m];
    int[] r = new int[m];

    for (int i = 0; i < m; i++) {
      l[i] = sc.nextInt();
      r[i] = sc.nextInt();
    }

    int min = 0;
    int max = 100001;

    for (int i = 0; i < m; i++) {
      min = Math.max(min,l[i]);
      max = Math.min(max,r[i]);
    }

    if (min > max) {
      System.out.println(0);
    } else {
      System.out.println(max-min+1);
    }
  }

}
