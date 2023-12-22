import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());

    int h[] = new int[N];
    for (int i = 0; i < N; i++) {
      h[i] = Integer.parseInt(sc.next());
    }

    long ans = 0;

    while (true) {
      int s = -1;
      for (int i = 0; i < N; i++) {
        if (h[i] > 0) {
          s = i;
          break;
        }
      }
      if (s < 0) {
        break;
      }

      ans++;
      for (int i = s; i < N; i++) {
        if(h[i]>0) {
          h[i]--;
        }else {
          break;
        }
      }

    }

    System.out.println(ans);
  }
}
