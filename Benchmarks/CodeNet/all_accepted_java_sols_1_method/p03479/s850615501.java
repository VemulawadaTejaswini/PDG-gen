import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long X = sc.nextLong();
    long Y = sc.nextLong();
    ArrayList<Long> array = new ArrayList<>();
    array.add(X);
    long i = X;
    while (true) {
      i = 2 * i;
      if (i > Y) {
        break;
      }
      array.add(i);
    }
    System.out.println(array.size());
  }
}