import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int k = sc.nextInt();
  int sum = 0;
  int[] arr = new int[n];
  for (int i = 0; i < n; i++) {
    arr[i] = sc.nextInt();
  }
  Arrays.sort(arr);
  int count = 0;
  for (int i = arr.length - 1; count < k; i--) {
    sum += arr[i];
    count++;
  }

  System.out.println(sum);
  }
}
