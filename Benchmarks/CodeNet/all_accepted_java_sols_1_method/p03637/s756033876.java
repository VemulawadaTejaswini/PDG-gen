import java.util.*;

public class Main {  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long[] a = new long[N];
    int con4 =0, con2 =0;
    for (int i =0; i<N; i++) {
      a[i] = sc.nextLong();
      if (a[i] % 4 ==0) {
        con4++;
      } else if (a[i] % 2 ==0) {
        con2++;
      }
    }
    if (N % 2 == 0) {
      if (con4 * 2 + con2 >= N) {
        System.out.print("Yes");
      } else {
        System.out.print("No");
      }
    }
    if (N % 2 == 1) {
      if (con4 * 3 + con2 >= N) {
        System.out.print("Yes");
      } else {
        System.out.print("No");
      }
    }
  }
}