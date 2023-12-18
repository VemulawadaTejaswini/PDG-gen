import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.Math;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int len = Integer.parseInt(br.readLine());
    String[] strs = br.readLine().split(" ");
    int[] numbers = new int[len];
    for (int i = 0; i < len; i++) {
      numbers[i] = Integer.parseInt(strs[i]);
    }
    Arrays.sort(numbers);
    int left = numbers[0], right = numbers[len-1];
    int sum = 0, min = 0;
    for (int i = left; i <= right; i++) {
      for (int j = 0; j < len; j++) {
        sum += Math.pow(numbers[j] - i, 2);
      }
      if (min == 0) {
        min = sum;
      } else {
        min = Math.min(min, sum);
      }
      sum = 0;
    }
    System.out.println(min);
  }
}