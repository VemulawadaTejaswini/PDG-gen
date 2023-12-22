import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] mList = new int[m];
    for (int i = 0; i < n; i++) {
      int k = sc.nextInt();
        for (int j = 0; j < k; j++) {
          int a = sc.nextInt();
          mList[a - 1]++;
        }
    }
    int count = 0;
    for (int mm : mList) {
      if (mm == n) {
        count++;
      }
    }
    System.out.print(count);
  }
}