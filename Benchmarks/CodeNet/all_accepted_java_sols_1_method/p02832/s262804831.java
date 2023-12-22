import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int count = 0;
    int num = 1;
    int n = Integer.parseInt(stdIn.next());
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(stdIn.next());
    }

    for (int i = 0; i < n; i++) {
      if (a[i] == num) num++;
      else count++;
    }

    if (count > n - 1) count = -1;

    System.out.println(count);
  }
}
