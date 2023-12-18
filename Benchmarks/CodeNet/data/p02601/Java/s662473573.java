import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int k = sc.nextInt();

    for (int i = 0; i < k; i++) {
      int newB = b * ((int) Math.pow(2, i));
      for (int j = 0; j < k; j++) {
        int newC = c * ((int) Math.pow(2, j));
        if (a < newB && newB < newC) {
          System.out.println("Yes");
          return;
        }
      }
    }
    System.out.println("No");
  }
}
