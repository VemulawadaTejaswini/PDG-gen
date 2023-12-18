import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    long[] a = new long[N];
    long[] b = new long[N];

    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextInt();
    }

    long sum_rest = 0;
    long rest;

    for (int i = N-1; i >= 0; i--) {
      a[i] += sum_rest;
      rest = a[i] % b[i];
      sum_rest += (b[i] - rest) % b[i];
    }

    System.out.println(sum_rest);
  }
}
