import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number_n, number_d, count = 0;
    number_n = Integer.parseInt(sc.next());
    number_d = Integer.parseInt(sc.next());
    count = number_n / (2 * number_d + 1);
    if(number_n % (2 * number_d + 1) != 0) count++;
    System.out.println(count);
  }
}
