import java.util.Scanner;

public class Main {

  /*
     input: 1 3 8
     output: Yes
  */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
    if (a < b && b < c) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}

