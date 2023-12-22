import java.util.Scanner;

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
    int n = Integer.parseInt(sc.next());

    int[] numbers = new int[n];
    for (int i = 0; i < n; i++) {
      numbers[i] = Integer.parseInt(sc.next());
    }
    
    int min = 12000;
    for (int k = 0; k < numbers.length; k++) {
      int sumRight = 0;
      int sumLeft = 0;
      for (int k2 = k + 1; k2 < numbers.length; k2++) {
        sumRight += numbers[k2];
      }
      for (int k3 = 0; k3 < k + 1; k3++) {
        sumLeft += numbers[k3];
      }
      min = Math.min(Math.abs(sumRight - sumLeft), min);
    }
    System.out.println(min);
  }
}

