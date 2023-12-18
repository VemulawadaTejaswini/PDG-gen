import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int[] arr = new int[n];
    int i = 0;
    for(i = 0 ; i < n ; i++ ){
      arr[i] = in.nextInt();
    }
    Arrays.sort(arr);
    int sum = 0;
    for(i = 0 ; i < k ; i++)
      sum += arr[i];
    System.out.println(sum);
  }
}