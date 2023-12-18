import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int five = 0;
    int seven = 0;
    for (int i = 0; i < 3; i++) {
      int n = sc.nextInt();
      if (n == 5) {
        five++;
      } else if (n == 7) {
        seven++;
      }
    }
    System.out.println(five == 2 && seven == 1 ? "YES" : "NO");
  }
}