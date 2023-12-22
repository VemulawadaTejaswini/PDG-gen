import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    int total = 0;
    int sum = 0;

    for (int i = 0; i <= n; i++) {
      String k = String.valueOf(i);
      for (int j = 0; j < k.length(); j++) {
        String x = String.valueOf(k.charAt(j));
        int y = Integer.parseInt(x);
        total += y;
      }
      if (total >= a && total <= b) {
        sum += i;
      }
      total = 0;
    }

    System.out.println(sum);

  }

}
