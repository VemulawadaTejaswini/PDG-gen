import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    System.out.format("%d:%d:%d\n", s / 60 / 60, s / 60 % 60, s % 60 % 60);
    sc.close();
  }
}
