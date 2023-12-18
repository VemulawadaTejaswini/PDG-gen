import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    Float x[] = new Float[N];
    String u[] = new String[N];
    for (int i = 0; i < N; i++) {
      x[i] = sc.nextFloat();
      u[i] = sc.next();
    }
    float ans = 0;
    for (int i = 0; i < N; i++) {
      if (u[i].equals("BTC")) {
        ans += x[i] * 380000.0000;
      }
      ans += x[i];
    }
    System.out.println(ans);
  }
}