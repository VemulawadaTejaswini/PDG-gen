import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int a = Integer.parseInt(stdIn.next());
    int b = Integer.parseInt(stdIn.next());

    if ((a + b) == 3) {
      System.out.println("3");
    } else if ((a + b) == 4) {
      System.out.println("2");
    } else if ((a + b) == 5) {
      System.out.println("1");
    }
  }
}
