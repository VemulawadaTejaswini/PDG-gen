import java.util.*;


public class Main {
  static int N, L;
  static String[] S;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    N = sc.nextInt();
    L = sc.nextInt();

    S = new String[N];
    for(int i = 0; i < N; i++) {
      S[i] = sc.next();
    }

    Arrays.sort(S);

    for(int i = 0; i < N; i++) {
      System.out.print(S[i]);
    }
    System.out.println("");
  }
}
