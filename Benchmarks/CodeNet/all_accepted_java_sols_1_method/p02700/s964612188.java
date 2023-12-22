import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int aCount = a % d == 0 ? a / d : a / d + 1;
    int bCount = c % b == 0 ? c / b : c / b + 1;
    System.out.println(aCount >= bCount ? "Yes" : "No");
  }

}