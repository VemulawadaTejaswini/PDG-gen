import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] spaces = sc.nextLine().split("");
    int count = 0;

    for (String space: spaces) {
      if (Integer.parseInt(space) == 1) {
        count++;
      }
    }

    System.out.println(count);
  }
}
