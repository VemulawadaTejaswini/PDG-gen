import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    while(true) {
      int n = s.nextInt();
      int m = s.nextInt();
      int a = s.nextInt();
      if(n == 0 && m == 0 && a == 0) break;

      int[] he = new int[m];
      int[] fi = new int[m];
      int[] se = new int[m];

      
      for(int i = 0; i < m; i++) {
        he[i] = s.nextInt();
        fi[i] = s.nextInt(); 
        se[i] = s.nextInt();
      }


      for(int j = 1000; j > 0; j--) {
        for(int k = 0; k < m; k++) {
          if(he[k] == j) {
            if(fi[k] == a) {
              a = se[k];
              continue;
            }
            if(se[k] == a) {
              a = fi[k];
              continue;
            }
          }
        }
      }

      System.out.println(a);
      
    }
  }
}