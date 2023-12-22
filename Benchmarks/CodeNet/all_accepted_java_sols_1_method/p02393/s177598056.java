import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdInt = new Scanner(System.in);

    int a, b, c, tmp;
    a = stdInt.nextInt();
    b = stdInt.nextInt();
    c = stdInt.nextInt();

    if (a > b) {
      tmp = a;
      a = b;
      b = tmp;
    }
    if (b > c) {
      tmp = b;
      b = c;
      c = tmp;
    }
    if (a > b) {
      tmp = a;
      a = b;
      b = tmp;
    }

    System.out.println(a +" " +  b + " " + c);
  }
}
