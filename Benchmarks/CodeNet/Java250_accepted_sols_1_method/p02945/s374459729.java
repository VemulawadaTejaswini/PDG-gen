import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      int max = a + b;
      if (a - b > max) {
        max = a -b;
      }
      if (a * b > max) {
        max = a * b;
      }
      System.out.println(max);
    }
}