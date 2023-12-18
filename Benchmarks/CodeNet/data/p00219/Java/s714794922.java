import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
      
    while (true) {
      int isZero = scan.nextInt();
      
      if (isZero == 0) {
        break;
      } else {
        int cnt = isZero;
        int[] kind = new int[10];
            
        for (int i = 0; i < cnt; i++) {
          int tmp = scan.nextInt();
          kind[tmp]++;
        }
            
        for (int i : kind) {
          if (i > 0) {
            for (int j = 0; j < i; j++) {
              System.out.print("*");
            }
            System.out.println();
          } else {
            System.out.println("-");
          }
        }
      }
    }
  }
}

