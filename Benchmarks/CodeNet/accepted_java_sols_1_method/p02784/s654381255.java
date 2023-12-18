import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int N = sc.nextInt();
    int sum = 0;

    int[] A = new int [N];
    for(int n = 0; n < N; n++) {
      A[n] = sc.nextInt();
      sum = sum + A[n];
    }

    if(sum >= H) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}