import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    double B = sc.nextDouble();
    long C = A * (long)(B * 100 + 0.1);
    System.out.println(C / 100);
  }
}
