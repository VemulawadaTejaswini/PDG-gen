import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int result = 0;
    for (int i = 1; i <= n; i++) {
      int a = sc.nextInt();
      if (i % 2 != 0 && a % 2 != 0) {
        result++;
      }
    }
    System.out.println(result);
  }
}
