import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    int r = sc.nextInt();
    int d = sc.nextInt();
    int result = 0;
    for (int i = 1; i <= 100; i++) {
      if (l <= d * i && d * i <= r) {
        result++;
      }
    }
    System.out.println(result);
  }
}
