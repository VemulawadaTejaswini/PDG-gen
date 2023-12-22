import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Y = sc.nextInt();
    int x = -1;
    int y = -1;
    int z = -1;
    for (int i = 0; i <= N; i++) {
      for (int j = 0; j <= N - i; j++) {
        int sum = i * 10000 + j * 5000 + (N - i - j) * 1000;
        if (sum == Y) {
          x = i;
          y = j;
          z = N - i - j;
          break;
        }
      }
    }
    System.out.println(x + " " + y + " " + z);
  }
}