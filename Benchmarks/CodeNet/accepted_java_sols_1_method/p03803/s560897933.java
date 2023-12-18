import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if (a == 1) {
      a += 13;
    }
    
    int b = sc.nextInt();
    if (b == 1) {
      b += 13;
    }
    
    if (a > b) {
      System.out.println("Alice");
    } else if (a == b) {
      System.out.println("Draw");
    } else {
      System.out.println("Bob");
    }

  }
}