import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    int[] x = new int[n];
    int[] y = new int[n];
    String[] a = sc.nextLine().split(" ");
    String[] b = sc.nextLine().split(" ");
    for(int i = 0; i < n; i++) {
      x[i] = Integer.parseInt(a[i]);
      y[i] = Integer.parseInt(b[i]);
    }
    double manha = 0;
    double eucli = 0;
    double minko = 0;
    double cheby = 0;
    double sum = 0;
    for(int i = 0; i < n; i++) {
      manha += Math.abs(x[i] - y[i]);
    }
    for(int i = 0; i < n; i++) {
      sum += Math.pow(x[i] - y[i], 2);
    }
    eucli = Math.sqrt(sum);
    sum = 0;
    for(int i = 0; i < n; i++) {
      sum += Math.pow(Math.abs(x[i] - y[i]), 3);
    }
    minko = Math.cbrt(sum);
    double max = 0;
    for(int i = 0; i < n; i++) {
      if(Math.abs(x[i] - y[i]) > max) {
        max = Math.abs(x[i] - y[i]);
      }
    }
    cheby = max;
    System.out.println(manha);
    System.out.println(eucli);
    System.out.println(minko);
    System.out.println(cheby);
  }
}

