import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] data = new int[n];

    for (int i = 0; i < n; i++) {
      data[i] = sc.nextInt();
    }

    Arrays.sort(data);
    int sum = data[n-1] / 2;

    for (int i = 0; i < n-1; i++) {
      sum += data[i];
    }

    System.out.println(sum);

  }

}
