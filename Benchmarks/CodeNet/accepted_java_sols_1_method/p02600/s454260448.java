import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    if (400 <= x && x < 600) {
      System.out.println(8);
    } else if (600 <= x && x < 800) {
      System.out.println(7);
    } else if (800 <= x && x < 1000) {

      System.out.println(6);
    } else if (1000 <= x && x < 1200) {

      System.out.println(5);
    } else if (1200 <= x && x < 1400) {

      System.out.println(4);
    } else if (1400 <= x && x < 1600) {

      System.out.println(3);
    } else if (1600 <= x && x < 1800) {

      System.out.println(2);
    } else {
      System.out.println(1);
    }
  }
}
