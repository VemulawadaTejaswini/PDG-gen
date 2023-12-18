import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    long a = Arrays.stream(n.split("")).map(Long::parseLong).reduce(0L, (a1, a2) -> a1 + a2);
    System.out.println(a % 9 == 0 ? "Yes" : "No");
  }
}
