import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    String B = A.toUpperCase();
    if (A.equals(B)) {
      System.out.println("A");
    } else {
      System.out.println("a");
    }
    sc.close();
  }
}