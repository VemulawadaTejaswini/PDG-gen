import java.util.Scanner;
import java.util.InputMismatchException;


public class Main {

    public static void main(String[] args) {

    try {
      Scanner scanner = new Scanner(System.in);
 
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      int h = scanner.nextInt();
 
      System.out.println( (x + y) * h / 2 );
      scanner.close();
    } catch (InputMismatchException e) { 
      System.out.println("整数を入力してください。");
    }
  }
}
