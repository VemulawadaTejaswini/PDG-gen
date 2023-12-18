import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int min, max, sum;
    String[] strArray = br.readLine().split(" ");
    int[] intArray = new int[n];
    for (int i = 0;i < n;i++) {
      intArray[i] = Integer.parseInt(strArray[i]);
    }
    min = intArray[0];
    max = intArray[0];
    sum = intArray[0];
    for (int i = 1;i < n;i++) {
      min = Math.min(min,intArray[i]);
      max = Math.max(max,intArray[i]);
      sum += intArray[i];
    }
    System.out.println(min + " " + max + " " + sum);
  }
}