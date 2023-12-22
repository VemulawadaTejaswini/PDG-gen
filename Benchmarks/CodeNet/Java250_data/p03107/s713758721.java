import java.util.Scanner;

/**
 * Unification
 *
 */
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] target = scanner.nextLine().split("");
    int numOfZero = 0;
    int numOfOne = 0;
    
    for (String s : target) {
      if ("0".equals(s)) numOfZero++;
      if ("1".equals(s)) numOfOne++;
    }
    
    
    if (numOfOne >= numOfZero) {
      System.out.println(2 * numOfZero);
    } else {
      System.out.println(2 * numOfOne);
    }
  }
}