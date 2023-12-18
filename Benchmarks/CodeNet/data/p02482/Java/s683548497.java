import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a, b;

    a = sc.nextInt();
    b = sc.nextInt();

    if(a < b) {
      System.out.println("a < b");
    }
    if(a > b) {
      System.out.println("a > b");
    }
    if(a == b) {
      System.out.println("a == b");
    }
  }