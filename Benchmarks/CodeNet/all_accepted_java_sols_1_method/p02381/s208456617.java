import java.util.Scanner;
 
class Main {
        public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
               while (true) {
                      int x = sc.nextInt();
                      if (x == 0){
                              break;
                      }
                      double sum = 0;
                      int[] y = new int[x];
                      for (int i = 0; i < x; i++) {
                              y[i] = sc.nextInt();
                              sum += y[i];
                      }
                      double c = sum / x;
                      double d = 0;
                      for (int i = 0; i < x; i++) {
                              d += Math.pow(y[i] - c, 2) / x;
                      }
                      System.out.println(Math.sqrt(d));
               }
 
        }
}