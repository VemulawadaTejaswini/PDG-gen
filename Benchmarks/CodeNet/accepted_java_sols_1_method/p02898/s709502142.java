import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();

    int[] h = new int[n];
    for (int i = 0; i < n; i++) {
        h[i] = sc.nextInt();
    }
    
    long ans = Arrays.stream(h).filter(x -> x >= k).count();
    System.out.println(ans);
  }
}