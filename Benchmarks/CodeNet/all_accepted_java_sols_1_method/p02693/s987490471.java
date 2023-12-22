import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    boolean flag = false;
    for (int i = 1; i <= b / k; i++) {
      if (k * i >= a && k * i <= b) {
        flag = true;
      }
    }
    System.out.println(flag ? "OK" : "NG");
  }

}