import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int d = sc.nextInt();
    int t = sc.nextInt();
    int s = sc.nextInt();
    System.out.println(d / s < t || (d / s == t && d % s == 0) ? "Yes" : "No");
  }
}
