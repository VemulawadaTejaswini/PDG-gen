import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();
    if (b == 1) {
      System.out.println(0);
      return;
    }
    b -= a;
    if (b <= 0) {
      System.out.println(1);
    } else if (b % (a - 1) == 0){
      System.out.println(1 + b / (a - 1));
    } else {
      System.out.println(2 + b / (a - 1));
    }
  }
}
