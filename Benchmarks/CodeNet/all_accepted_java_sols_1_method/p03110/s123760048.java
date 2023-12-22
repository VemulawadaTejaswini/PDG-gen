import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    double[] x = new double[N];
    String[] u = new String[N];

    for (int i = 0; i < N; i++) {
      x[i] = sc.nextDouble();
      u[i] = sc.next();
    }

    sc.close();

    double sum = 0.0;

    for (int i = 0; i < N; i++) {
      if (u[i].equals("JPY")) {
        sum += x[i];
      } else {
        sum += x[i] * 380000;
      }
    }

    System.out.println(sum);

  }

}