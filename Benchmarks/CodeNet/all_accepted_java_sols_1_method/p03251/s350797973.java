import java.util.Scanner;

public class Main {
  public static void main(String args[]) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int M = scanner.nextInt();
    int X = scanner.nextInt();
    int Y = scanner.nextInt();
    for(int i = 0; i < N; ++i) {
        int p = scanner.nextInt();
        if (X < p) X = p;
    }
    for(int i = 0; i < M; ++i) {
        int p = scanner.nextInt();
        if (p < Y) Y = p;
    }
    if(X < Y) {
        System.out.println("No War");
    } else {
        System.out.println("War");
    }
  }
}
