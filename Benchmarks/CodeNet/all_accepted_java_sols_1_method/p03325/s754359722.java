import java.util.Scanner;

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long[] a = new long[N];
    long count =0;
    for (int i =0; i<N; i++) {
      a[i] = sc.nextLong();
      while (a[i] % 2 == 0) {
        count++;
        a[i] /= 2;
      }
    }
    System.out.println(count);
  }
}