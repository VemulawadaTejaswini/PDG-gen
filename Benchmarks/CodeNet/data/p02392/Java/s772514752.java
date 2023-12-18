import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number_a, number_b, number_c;
    number_a = Integer.parseInt(sc.next());
    number_b = Integer.parseInt(sc.next());
    number_c = Integer.parseInt(sc.next());
    if(number_a < number_b && number_b < number_c) System.out.println("Yes");
    else System.out.println("No");
  }
}
