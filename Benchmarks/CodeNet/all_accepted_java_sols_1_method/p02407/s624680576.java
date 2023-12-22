import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    int n = stdin.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = stdin.nextInt();
    }

    System.out.print(arr[n - 1]);
    for (int i = n - 2; i >= 0; i--) {
      System.out.printf(" %d", arr[i]);
    }
    System.out.println("");
  }

}