import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] H = new int[N];
    int n =0;
    for (int i =0; i<N; i++) {
      H[i] = sc.nextInt();
    }
    for (int i =1; i<N; i++) {
      for (int j =0; j<i; j++) {
        if(H[i] < H[j]) {
          n++;
          break;
        }
      }
    }
    System.out.println(N-n);
  }
}