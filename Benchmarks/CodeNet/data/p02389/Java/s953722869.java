import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner yomikomi = new Scanner(System.in);
    int a = yomikomi.nextInt();
    int b = yomikomi.nextInt();
    System.out.println( (a*b) + " " + ((2 * a)+(2 * b)));
  }
}