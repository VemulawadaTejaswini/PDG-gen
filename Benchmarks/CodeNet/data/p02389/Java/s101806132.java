import java.util.Scanner;

public class Main {
  public static void main(String[] args);
    Scanner yomikomi = new Scanner(System.in);
    int a = yomikomi.nextInt();
    int b = yomikomi.nextInt();
    int ab = a * b;
    int aa = 2 * a;
    int bb = 2 * b;
    int syuu = aa + bb;
    System.out.println(ab + " " + syuu);
  }
}