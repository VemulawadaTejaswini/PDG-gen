import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int preT = 0;
    int preX = 0;
    int preY = 0;
    for (int i = 0; i < N; i++) {
      int t = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();
      
      int diffT = t - preT;
      int diffX = Math.abs(x - preX);
      int diffY = Math.abs(y - preY);
      
      if (diffX + diffY > diffT
          || (diffT-diffX-diffY)%2 == 1) {
        System.out.println("No");
        return;
      }
      
      preT = t;
      preX = x;
      preY = y;
    }
    
    System.out.println("Yes");
  }
}