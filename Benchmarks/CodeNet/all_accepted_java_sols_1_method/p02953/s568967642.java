import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());

    long[] H = new long[N];
    for (int i = 0; i < N; i++) {
      H[i] = Long.parseLong(sc.next());
    }

    for (int i = H.length-1; i > 0; i--) {
      if (H[i] < H[i-1]) {
        if (H[i] == H[i-1]-1) {
          H[i-1]--;
        } else {
          System.out.println("No");
          return;
        }
      }
    }

    System.out.println("Yes");
  }
}