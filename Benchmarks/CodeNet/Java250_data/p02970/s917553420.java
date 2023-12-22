import java.util.*;
public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int D = sc.nextInt();
    sc.close();

    double r = (double) N / (2 * D + 1);

    int res = (int) Math.ceil(r);

    System.out.println(res);

  }
  
}