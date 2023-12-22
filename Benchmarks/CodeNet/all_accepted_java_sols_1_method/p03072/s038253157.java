import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int n = s.nextInt();
    int count = 0;
    int maxH = 0;
    for (int i = 0; i < n; i++) {
      int h = s.nextInt();
      if (h >= maxH) {
        count++;
        maxH = h;
      }
    }
    System.out.println(count);
  }
}
