import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int a1 = Integer.parseInt(stdIn.next());
    int a2 = Integer.parseInt(stdIn.next());
    int a3 = Integer.parseInt(stdIn.next());

    if (a1 + a2 + a3 >= 22) {
      System.out.println("bust");
    } else {
      System.out.println("win");
    }
  }
}
