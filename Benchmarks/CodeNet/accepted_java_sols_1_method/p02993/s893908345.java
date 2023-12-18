import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    String[] sList = s.split("");

    for (int i = 0; i < 3; i++) {
      String current = sList[i];
      String next = sList[i+1];

      if(current.equals(next)) {
        System.out.println("Bad");
        return;
      }
    }

    System.out.println("Good");
  }
}
