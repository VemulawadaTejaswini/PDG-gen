import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] row = new int[N];
    for (int i=0; i<N; i++) row[i] = sc.nextInt();
    int distance = 0;
    Arrays.sort(row);
    for (int i=1; i<N; i++) {
      distance += row[i] - row[i-1];
    }
    System.out.print(distance);
  }
}