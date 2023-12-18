import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int gu = k / 2;
    int ki = k - gu;
    System.out.println(ki * gu);
  }
}