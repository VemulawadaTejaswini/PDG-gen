
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author author
 *
 */
public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Set<String> judge = new HashSet<>(Arrays.asList(sc.next().split("")));

    if (judge.size() == 2) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }

}
