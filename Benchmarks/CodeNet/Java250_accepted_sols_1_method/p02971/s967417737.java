import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] max = new int[2][2];
    int tmp;
    int N = sc.nextInt();
    for (int i = 0; i < N; i++) {
      tmp = sc.nextInt();
      if (max[0][0] < tmp) {
        max[0][0] = tmp;
        max[0][1] = i;
      } else if (max[1][0] < tmp) {
        max[1][0] = tmp;
        max[1][1] = i;
      }
    }
    for (int i = 0; i < N; i++)
      if (i == max[0][1])
	    System.out.println(max[1][0]);
      else
        System.out.println(max[0][0]);
  }
}