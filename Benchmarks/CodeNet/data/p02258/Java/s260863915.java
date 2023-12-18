import java.util.Scanner;

class Main {
  public static void main(String... args) {
    Scanner sc = new Scanner(System.in);
    int times = sc.nextInt();
    int minimum = sc.nextInt();
    int maximum = minimum;
    int input;
    int before = minimum;
    int benefit = -2000000;
    boolean check = false;
    for (int i = 1; i < times; i++) {
      input = sc.nextInt();

      if (input < minimum) {
        minimum = input;
        check = true;
      }

      if (!check && input - minimum > benefit) {
        benefit = input - minimum;
      } else if (check && input - before > benefit) {
        benefit = input - before;
      }

      before = input;
    }
    System.out.println(benefit);
  }
}

