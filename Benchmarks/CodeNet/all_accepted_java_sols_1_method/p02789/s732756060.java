import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int n = scanner.nextInt();
    final int m = scanner.nextInt();
    
    if(n == m) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
