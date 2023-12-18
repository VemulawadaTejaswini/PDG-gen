import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int order[];
    order = new int[N];

    for(int i = 0; i < N; i++) {
      order[sc.nextInt() - 1] = i + 1;
    }
    for(int n = 0; n < N; n++) {
      System.out.println(order[n]);
    }
  }
}
