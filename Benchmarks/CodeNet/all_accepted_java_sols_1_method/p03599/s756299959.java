import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    int E = sc.nextInt();
    int F = sc.nextInt();

    double max = -1;
    int maxSugar = 0;
    int maxSugarWater = -1;
    for (int i = 0; i*100 <= F; i++) {
      for (int m = 0; m*A*100 <= i*100; m++) {
        if ((i-m*A)%B == 0) {
          int n = (i-m*A)/B;
          if (m == 0 && n == 0) {
            continue;
          }
        
          //System.err.println(F-i*100 + " " + i*E);
          int sugarCap = Math.min(F-i*100, i*E);
          for (int p = 0; p*C <= sugarCap; p++) {
            int q = (sugarCap-p*C) / D;
            int sugar = p*C + q*D;
            int sugarWater = sugar + m*A*100 + n*B*100;
            double v = (double) 100*sugar/sugarWater;
            //System.err.println(sugarWater + " " + sugar);
            if (sugarWater <= F && max < v) {
              max = v;
              maxSugar = sugar;
              maxSugarWater = sugarWater;
            }
          }
        }
      }
    }
    
    System.out.println(maxSugarWater + " " + maxSugar);
  }
}