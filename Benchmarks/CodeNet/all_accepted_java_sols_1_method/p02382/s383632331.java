import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
      int n;
      
      Scanner sc = new Scanner(System.in);
      while (sc.hasNext()) {
        n = sc.nextInt();
        int x[] = new int[n];
        int y[] = new int[n];
        double total = 0;
        double max =(double)0;
        for (int i=0; i<n; i++) {
          x[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++) {
          y[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++) { //p = 1
          double a = Math.abs((double)x[i] - y[i]);
          total += a;
          if (a - max > 0 ) {
            max = a; //p = ∞
          }
        }
        System.out.println(total);
        total = 0;
        for (int i=0; i<n; i++) { //p = 2
          total += Math.abs((double)x[i] - y[i]) * Math.abs((double)x[i] - y[i]); 
        }
        System.out.println(Math.sqrt(total));
        total = 0;
        for (int i=0; i<n; i++) { //p = 3
          total += Math.abs((double)x[i] - y[i]) * Math.abs((double)x[i] - y[i]) * Math.abs((double)x[i] - y[i]);
        }
        System.out.println(Math.cbrt(total));
        System.out.println(max);
      }
    }
}
