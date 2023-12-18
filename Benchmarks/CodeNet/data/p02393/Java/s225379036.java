import java.util.Scanner;

class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int bf;

    if (a > b) {
      bf = a;
      a = b;
      b = bf;
    }
    if (b > c) {
      bf = b;
      b = c;
      c = bf;
    }
    if (a > b) {
      bf = a;
      a = b;
      b = bf;
    }
    System.out.println(a + " " + b + " " + c);
  }
}
