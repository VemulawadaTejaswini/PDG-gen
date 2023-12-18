import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a, b, c;
    a = input.nextInt();
    b = input.nextInt();
    c = input.nextInt();

    System.out.println(min(a, min(b, c)) + " " + max(min(a, b), max(min(b, c), min(a, c))) + " " + max(a, max(b, c)));
  }
  public static int min(int a, int b) {
    if (a < b) return (a);
    else return (b);
  }
  public static int max(int a, int b) {
    if (a < b) return (b);
    else return (a);
  }
}