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
    double max = -1.0;
    int waterANS = -1;
    int sugarANS = -1;
    for (int i = 0; (100 * A * i) <= F; i++) {
      int waterA = 100 * A * i;
      for (int j = 0; (waterA + (100 * B * j)) <= F; j++) {
        int waterB = 100 * B * j;
        int water = waterA + waterB;
        if (water == 0) {
          continue;
        }
        for (int k = 0; (C * k) <= F; k++) {
          int sugarC = C * k;
          for (int l = 0; (sugarC + (D * l)) <= F; l++) {
            int sugarD = D * l;
            int sugar = sugarC + sugarD;
            int mul = water / 100;
            double late = (double)(100 * sugar) / (double)(water + sugar);
            if (water + sugar <= F && sugar <= E * mul && late > max) {
              max = late;
              waterANS = water;
              sugarANS = sugar;
            }
          }
        }
      }
    }
    System.out.println((waterANS + sugarANS) + " " + sugarANS);
  }
}