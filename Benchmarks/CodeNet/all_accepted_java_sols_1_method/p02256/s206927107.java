import java.util.Scanner;

class Main {
  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int lower;
    int bigger;
    if (a > b) {
      lower = b;
      bigger = a;
    } else {
      lower = a;
      bigger = b;
    }
    int tmp = bigger % lower;
    while(lower != 0) {
      tmp = bigger % lower;
      bigger = lower;
      lower = tmp;
    }
    System.out.println(bigger);
  }
}

