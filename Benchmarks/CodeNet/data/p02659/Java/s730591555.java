import java.util.Scanner;
import java.util.Locale;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    long a = sc.nextLong();
    long b = (long)(sc.nextDouble() * 100);
    sc.close();
    long r = (a * b) / 100;
    System.out.println(r);
  }
}