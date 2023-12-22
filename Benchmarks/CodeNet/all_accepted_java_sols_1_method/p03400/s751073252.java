import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int day = sc.nextInt();
    int choco = sc.nextInt();
    int totalChoco = 0;
    for (int i = 0; i < n; i++) {
      int player = sc.nextInt();
      int div = day / player;
      if (day % player == 0) {
        totalChoco += div;
      } else {
        totalChoco += (div + 1);
      }
    }
    System.out.println(totalChoco + choco);
  }
}