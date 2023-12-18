import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n, m, x;
    n = sc.nextInt();
    m = sc.nextInt();
    x = sc.nextInt();

    int start = 0;
    int fin = 0;
    for (int i = 0; i < m; i++) {
      int num = sc.nextInt();
      if (num < x) {
        start++;
      } else if (num > x) {
        fin++;
      }
    }
    System.out.println(Math.min(start, fin));
  }
}
