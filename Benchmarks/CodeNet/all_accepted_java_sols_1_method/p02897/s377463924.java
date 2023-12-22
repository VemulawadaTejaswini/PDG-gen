import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = Integer.parseInt(sc.next());
    double x = (number % 2 == 1)? number / 2 + 1 : number / 2;
    System.out.println(x / number);
  }
}
