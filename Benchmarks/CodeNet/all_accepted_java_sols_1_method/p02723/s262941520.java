import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  	Scanner input = new Scanner(System.in);
    String str = input.nextLine();

    if (str.charAt(2) == str.charAt(3) && str.charAt(4) == str.charAt(5)) {
      System.out.println("Yes");
    }
    else {
      System.out.println("No");
    }
  }
}