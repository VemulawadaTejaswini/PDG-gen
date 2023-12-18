import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    if (n >= m){
      System.out.println(0);
    } else {
      int[] array = new int[m];
      for (int i = 0; i < m; i++) {
        array[i] = in.nextInt();
      }

      Arrays.sort(array);
      int[] steps = new int[m - 1];
      for(int i = 0; i < m - 1; i++) {
        steps[i] = array[i + 1] - array[i];
      }

      Arrays.sort(steps);
      int[] result = new int[m - n];
      System.arraycopy(steps, 0, result, 0, m - n );

      int sum = 0;
      for(int i = 0; i < result.length; i++) {
        sum += result[i];
      }

      System.out.println(sum);
    }
  }
}