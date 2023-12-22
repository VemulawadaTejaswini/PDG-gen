import java.util.*;

class Main {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int X = sc.nextInt();
    int a[] = new int[N+1];
    int sum = 0;
    for (int i = 0; i <= N; i++) {
      if (i == 0) a[0] = 0;
      else {
        a[i] = sc.nextInt();
        sum += a[i];
      }
      if (sum > X) {
        System.out.println(i);
        return;
      }
    }
    System.out.println(N+1);
  }
}
