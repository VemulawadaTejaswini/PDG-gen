import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    int a = stdIn.nextInt();
    int b = stdIn.nextInt();
    int c = stdIn.nextInt();
    int k = stdIn.nextInt();

    int max = a;
    if (max < b) max = b;
    if (max < c) max = c;

    int other = 0;
    if (max == a) other = b + c;
    if (max == b) other = c + a;
    if (max == c) other = a + b;

    for (int i = 0; i < k; i++) {
      max*=2;
    }

    System.out.println(max + other);
  }
}