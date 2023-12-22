import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int a = sc.nextInt();
    int sum = 0;
    while (true) {
      h = h - a;
      sum++;
      if (h <= 0) {
        break;
      }
    }
    System.out.println(sum);
  }
}