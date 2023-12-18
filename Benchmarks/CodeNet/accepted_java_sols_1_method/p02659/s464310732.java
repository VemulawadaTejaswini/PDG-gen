import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    double b = sc.nextDouble();
    long B = (long)(b * (double)100 + 0.01);
    System.out.println((a * B) / (long)100);
  }
}