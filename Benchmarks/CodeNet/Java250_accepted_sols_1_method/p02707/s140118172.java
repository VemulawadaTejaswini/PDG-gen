import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    int[] a = new int[n + 1];
    for (int i = 1; i < n; i++) {
      int j = scan.nextInt();
      a[j]++;
    }

    for (int i = 1; i < n + 1; i++) {
      System.out.println(a[i]);
    }

  }

}
