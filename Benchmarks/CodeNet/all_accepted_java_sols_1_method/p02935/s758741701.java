import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    List<Double> v = new ArrayList<Double>();
    for(int i = 0; i < n; i++) v.add(scan.nextDouble());

    Collections.sort(v);
    for(int i = 0; i < n - 1; i++) {
      double x = (double)v.get(0);
      double y = (double)v.get(1);
      x = (x + y) / 2.0;
      v.set(0, x);
      v.remove(1);
    }

    System.out.println(v.get(0));
  }
}