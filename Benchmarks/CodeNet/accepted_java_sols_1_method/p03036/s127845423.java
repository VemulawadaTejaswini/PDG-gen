import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int r = stdIn.nextInt();
    int d = stdIn.nextInt();
    int x2000 = stdIn.nextInt();
    int[] x = new int[11];
    x[0] = x2000;
    for(int i = 1;i<x.length;i++) {
      x[i] = x[i-1]*r-d;
      System.out.println(x[i]);
    }
  }
}
