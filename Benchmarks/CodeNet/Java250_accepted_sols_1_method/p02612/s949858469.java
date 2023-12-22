import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    Integer N = Integer.valueOf(input.nextLine());
    if (N % 1000 == 0) {
      System.out.println(0);
    }
    else {
      System.out.println(1000 - N % 1000);
    }
  }
}