import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println((int) Math.ceil(sc.nextDouble() / (2 * sc.nextInt() + 1)));
  }
}