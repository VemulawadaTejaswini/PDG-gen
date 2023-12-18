import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = Integer.parseInt(sc.next());
    String str = sc.next();
    if(number >= 3200) {
      System.out.println(str);
    } else {
      System.out.println("red");
    }
  }
}
