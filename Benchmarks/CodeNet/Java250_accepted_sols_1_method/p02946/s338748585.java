import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number_k, number_x, i;
    number_k = Integer.parseInt(sc.next());
    number_x = Integer.parseInt(sc.next());
    System.out.print(number_x - number_k + 1);
    for(i = 1; i <= 2 * number_k - 2; i++) {
      System.out.print(" " + (number_x - number_k + 1 + i));
    }
    System.out.println();
  }
}
