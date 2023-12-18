import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number_a, number_b, number_d, number_r;
    double number_f;
    number_a = Integer.parseInt(sc.next());
    number_b = Integer.parseInt(sc.next());
    number_d = number_a / number_b;
    number_r = number_a % number_b;
    number_f = ((double)number_a) / ((double)number_b);
    String output = String.format("%d %d %f", number_d, number_r, number_f);
    System.out.println(output);
  }
}
