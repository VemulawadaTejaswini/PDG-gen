import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    final int SHEEP_NUM = s.nextInt();
    final int WOLF_NUM = s.nextInt();

    if (SHEEP_NUM <= WOLF_NUM) {
        System.out.println("unsafe");
    } else {
        System.out.println("safe");
    }
  }
}