import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int k = stdIn.nextInt();
    double per = 0;
    int[] a = new int[n];
    double[] b = new double[n];
    for(int i = 0;i<a.length;i++) {
      a[i] = i+1;
    }
    for(int i = 0;i<a.length;i++) {
      int count = a[i];
      b[i] = 1.0/n;
      for(;count<k;count*=2) {
        b[i] = b[i]*1/2;
      }
    }
    double sum = 0;
    for(int i = 0;i<b.length;i++) {
      sum += b[i];
    }
    System.out.println(sum);
  }
}
