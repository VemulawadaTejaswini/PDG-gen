import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
    }
    double sum = 0.0;
    for (int i = 0; i < N; i++) {
      sum += a[i];
    }
    double mean = sum / N;
    double min = 1000.0;
    int idx = -1;
     for (int i = 0; i < N; i++) {
       double tmp = Math.abs(mean - a[i]); 
       if (tmp < min) {
         min = tmp;
         idx = i;
       }
    }
    System.out.println(idx);
  }
}