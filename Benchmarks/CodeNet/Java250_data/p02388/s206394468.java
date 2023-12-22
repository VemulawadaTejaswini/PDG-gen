import java.util.Scanner;
public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    double d = Math.pow((double)i, 3.0);
    System.out.println((int)d);
  }
}