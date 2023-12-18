import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    Map<String, Integer> map = new HashMap<>();
    String[] list = new String[] {"AC", "WA", "TLE", "RE"};
    for (int i = 0; i < list.length; i++) {
      map.put(list[i], 0);
    }
    for (long i = 0; i < n; i++) {
      String s = sc.next();
      map.put(s, map.get(s) + 1);
    }
    for (int i = 0; i < list.length; i++) {
      System.out.print(list[i]);
      System.out.print(" x ");
      System.out.println(map.get(list[i]));
    }
  }
}
