import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int N = sc.nextInt();
 L: for (int i =0; i<N; i++) {
   int count =0;
      for (int x =1; x<Math.sqrt(i); x++) {
        for (int y =x; y<Math.sqrt(i); y++) {
          for (int z =y; z<Math.sqrt(i); z++) {
            if (x * x + y * y + z * z + x * y + y * z + z * x == i) {
              if (x == y && y == z && z == x) {
                System.out.println(1);
              } else if (x == y || y == z || z == x) {
                System.out.println(3);
              } else {
                System.out.println(6);
              }
              continue L;
            }
          }
        }
      }
      System.out.println(0);
    }
  }
}