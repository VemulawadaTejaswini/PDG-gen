import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int k = 1;
    int max = 1;

    for (int i = 1; i < x; i++) {
      for (int j = 2; j < x; j++) {
        k = (int)Math.pow(i,j);
        if (k <= x) {
          max = Math.max(max,k);
        }
      }
    }

    System.out.println(max);

  }

}
