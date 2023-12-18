import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long y = sc.nextLong();
    long mul_num = x;
    int count = 1;
    while(true) {
      mul_num *= 2;
      if(mul_num > y) {
        break;
      }
      count++;
    }
    System.out.println(count);
  }
}
