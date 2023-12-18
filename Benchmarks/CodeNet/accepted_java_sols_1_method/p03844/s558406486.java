import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    if (sc.next().equals("+")) {
      System.out.println(a + sc.nextInt());
    } else {
      System.out.println(a - sc.nextInt());
    }
    
  }
}