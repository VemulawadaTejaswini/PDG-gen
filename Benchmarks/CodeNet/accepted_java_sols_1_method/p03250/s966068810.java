import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int max1 = a * 10 + b + c;
    int max2 = b * 10 + a + c;
    int max3 = c * 10 + a + b;
    int max12 = max1 > max2 ? max1 : max2;
    int max23 = max2 > max3 ? max2 : max3;
    int max = max12 > max23 ? max12 : max23;
    System.out.println(max);
  }
}