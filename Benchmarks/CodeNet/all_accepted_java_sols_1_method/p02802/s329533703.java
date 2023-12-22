import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int N = scan.nextInt();
    int M= scan.nextInt();
    int[][] array = new int[N][2];
    for (int i = 0; i < M; i++) {
      int mondai = scan.nextInt() - 1;
      if ( " AC".equals(scan.nextLine())) {
        array[mondai][1] = 1;
      } else {
        if (array[mondai][1] != 1) {
          array[mondai][0] += 1;
        }
      }
    }
    int waResultCount = 0;
    int acResultCount = 0;
    for (int i = 0; i < N; i++) {
      if (array[i][1] == 1) {
        acResultCount += 1;
        waResultCount += array[i][0];
      }
    }
    System.out.println(acResultCount + " " + waResultCount);
  }
}
