import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.valueOf(sc.next());
    int M = Integer.valueOf(sc.next());
    int[] array = new int[N];

    int p;
    String S;
    int ans = 0;
    int pena = 0;
    for (int i = 0; i < M; i++) {
      p = Integer.valueOf(sc.next());
      S = sc.next();
      if (array[p-1] != -1) {
        if (S.equals("WA")) {
          array[p-1]++;
        } else {
          ans++;
          pena += array[p-1];
          array[p-1] = -1;
        }
      }
    }

    System.out.println(ans + " " + pena);
  }
}