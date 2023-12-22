import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    System.out.println(
        s.contains("RRR") ? 3 : s.contains("RR") ? 2 : s.contains("R") ? 1 : 0
    );
  }
}
