import java.util.*;

class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    if (b == 1) {
      System.out.println("0");
      return;
    }
    b -= a;
    int count = 1;
    while (b > 0) {
      b -= (a-1);
      count++;
    }
    System.out.println(count);
  }
}
