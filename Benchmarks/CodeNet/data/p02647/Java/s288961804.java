import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] a = new int[n];
    int[] temp = new int[n];
    int[] answer = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    
    while(k > 0) {
      Arrays.fill(temp, 0);
      for (int i = 0; i < n; i++) {
        int ki = a[i];
        for (int j = i - ki; j <= i + ki; j++) {
          if (j >= 0 && j < n) {
            temp[j]++;
          }
        }
      }
      k--;
      System.arraycopy(temp, 0, a, 0, temp.length);
    }

    for (int i = 0; i < n; i++) {
      System.out.print(temp[i] + " ");
    }
  }
}