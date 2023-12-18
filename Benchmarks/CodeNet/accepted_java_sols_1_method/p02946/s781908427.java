import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int k = Integer.parseInt(sc.next());
      int x = Integer.parseInt(sc.next());
      int min = x - k + 1;
      for (int i = 0;i < k * 2 -1;i++) {
        System.out.println(min);
        min += 1;
      }
    }
}