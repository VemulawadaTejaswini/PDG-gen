import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static final long MOD = 1000000007;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] array = new int[N];
    Arrays.setAll(array, i -> sc.nextInt());
    int count1 = 0;
    int count2 = 0;
    for (int i = 0; i < N; i++)
      for (int j = 0; j < N; j++)
        if (array[i] > array[j]) {
          count1++;
          if (i < j)
            count2++;
        }
    long tmp = K % 1000000007;
    System.out.println(((tmp * (tmp - 1) / 2) % MOD * count1 + tmp * count2) % MOD);
  }
}