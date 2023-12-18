import java.util.Scanner;
import java.util.Locale;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    long r = (long) (sc.nextLong() * sc.nextDouble());
    sc.close();
    System.out.println(r);
  }
}