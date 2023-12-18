import java.util.*;

class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      double r = sc.nextDouble();

      double menseki = r * r * Math.PI;
      double enshu = 2 * r * Math.PI;

      System.out.printf("%.5f %.5f\n", menseki, enshu);

      sc.close();
  }
}
