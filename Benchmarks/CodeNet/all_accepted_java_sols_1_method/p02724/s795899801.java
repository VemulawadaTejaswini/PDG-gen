import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int a = X / 500;
    int b = (X % 500) / 5;
    System.out.println(a * 1000 + b * 5);
  }
}
