import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] X = new int[N];
    for (int i = 0; i < N; i++) {
      X[i] = scanner.nextInt();
    }
    int ans = 1;
    int max = X[0];
    for (int i = 1; i < N; i++) {
      if (max <= X[i]) {
        ans++;
        max = X[i];
      }
    }
    System.out.println(ans);
  }

}
