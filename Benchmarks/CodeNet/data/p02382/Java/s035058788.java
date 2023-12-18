import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();
    int[] x = new int[n];
    int[] y = new int[n];
    int[] abs = new int[n];
    double d1 = 0;
    double d2 = 0;
    double d3 = 0;
    double dinf = 0;

    for (int i = 0; i < n; i++) {
      x[i] = scan.nextInt();
    }

    for (int i = 0; i < n; i++) {
      y[i] = scan.nextInt();
    }

    for (int i = 0; i < n; i++) {
      abs[i] = Math.abs(x[i] - y[i]);
      if(dinf < abs[i]) {
        dinf = abs[i];
      }
    }

    for (int i = 0; i < n; i++) {
      d1 += abs[i];
      d2 += Math.pow(abs[i], 2);
      d3 += Math.pow(abs[i], 3);
    }
    
    System.out.println(d1);
    System.out.println(Math.sqrt(d2));
    System.out.println(Math.cbrt(d3));
    System.out.println(dinf);

  }

}

