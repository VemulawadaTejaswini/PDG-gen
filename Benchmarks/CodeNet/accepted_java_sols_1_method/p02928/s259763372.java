import java.util.Scanner;
import java.util.Arrays;

public class Main{
  private static int mod = 1000000007;
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] array = new int[N];
    Arrays.setAll(array, i -> sc.nextInt());
    long count1 = 0;
    long count2 = 0;
    for (int i = 0; i < N - 1; i++)
      for (int j = i + 1; j < N; j++)
        if (array[i] > array[j])
          count1++;
        else if (array[i] < array[j])
          count2++;
    long k = K % mod;
    System.out.println((k * count1 % mod + (k * (k - 1) / 2) % mod * (count1 + count2) % mod) % mod);
  }
}