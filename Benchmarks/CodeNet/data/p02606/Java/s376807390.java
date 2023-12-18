import java.util.*;

class Main {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int l = sc.nextInt();
    int r = sc.nextInt();
    int d = sc.nextInt();
    int a = r - l + 1;
    System.out.println(a / d);
  }
}