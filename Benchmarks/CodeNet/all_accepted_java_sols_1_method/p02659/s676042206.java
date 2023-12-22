import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long a = in.nextLong();
    double b = in.nextDouble();
    long flooredB = (long) (b * 100 + 0.5);
    System.out.println(a * flooredB / 100);
    in.close();
  }
}