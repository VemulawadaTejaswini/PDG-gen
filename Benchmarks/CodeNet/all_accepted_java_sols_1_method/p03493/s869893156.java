import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int count = 0;

    for (char c : str.toCharArray()) {
      count = (c == '1') ? count + 1 : count;
    }

    System.out.println(count);
  }
}