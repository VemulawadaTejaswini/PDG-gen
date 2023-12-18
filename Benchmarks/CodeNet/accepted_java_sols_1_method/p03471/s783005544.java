import java.util.*;

public class Main {
 public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int Y = sc.nextInt();
    for(int x = n; x >= 0; x--) {
        for (int y = n - x; y >= 0; y--) {
            int z = n - x - y;
            int ans  = 10000 * x + 5000 * y + 1000 * z;
            if(Y  == ans) {
              System.out.println(String.format("%d %d %d", x, y, z));
              return;
            }
        }
    }
    System.out.println("-1 -1 -1");
 }
}