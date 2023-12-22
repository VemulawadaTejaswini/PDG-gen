import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println((int) (num + Math.pow(num, 2) + Math.pow(num, 3)));
    sc.close();
  }
}
