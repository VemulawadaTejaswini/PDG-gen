import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    int n = stdIn.nextInt();
    int k = stdIn.nextInt();
    int q = stdIn.nextInt();
    int[] a = new int[q];
    for (int i = 0; i < q; i++) {
      a[i] = stdIn.nextInt();
    }

    int[] point = new int[n];
    for (int i = 0; i < n; i++) {
      point[i] = k;
    }

    int[] count = new int[n];
    for (int i = 0; i < q; i++) {
      count[a[i]-1]++;
    }

    for (int i = 0; i < n; i++) {
      point[i] = point[i] - q + count[i];
      if (point[i] > 0) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
  }
}
