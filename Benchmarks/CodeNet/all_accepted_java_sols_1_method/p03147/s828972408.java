import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] h = new int[N];
    int count =0;
    for (int i =0; i<N; i++) {
      h[i] = sc.nextInt();
    }
    
    int a =0; int b=0;
    L:while (a<= N-1 && b<= N-1) {
      if (h[a] ==0) {
        a++;
        continue;
      }
      //aを決定
      b = a;
      while (b <= N-1) {
        if (h[b] !=0 && b != N -1) {
          b++;
          continue;
        } else {
          for (int i =a; i<=b; i++) {
            h[i]--;
            if (h[i] <0) {
              h[i] =0;
            }
          }
        }
        count++;
        continue L;
      }
    }
    System.out.println(count);
  }
}