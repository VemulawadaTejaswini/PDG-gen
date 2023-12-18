import java.util.stream.IntStream;

public class Main {
  public static void main(String[] args) {
    try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
      int n = sc.nextInt();
      int[] x = new int[n];
      int[] y = new int[n];
      IntStream.range(0, n).forEachOrdered(num -> x[num] = sc.nextInt());
      IntStream.range(0, n).forEachOrdered(num -> y[num] = sc.nextInt());

      IntStream.rangeClosed(1, 3)
          .forEachOrdered(num -> System.out.println(calcDistance(x, y, num)));
      System.out.println(calcDistance(x, y, Integer.MAX_VALUE));
      
    }
  }
 
  public static double calcDistance(int[] x, int[] y, int p) {
    double tmp = 0.0;
    for (int i = 0; i < x.length; i++) {
      double abs = Math.abs(x[i] - y[i]);
      tmp = (p == Integer.MAX_VALUE) ? Math.max(abs, tmp) : tmp + Math.pow(abs, p);
    }
    return (p == Integer.MAX_VALUE) ? tmp : Math.pow(tmp, 1.0 / (double) p);
  }

}
