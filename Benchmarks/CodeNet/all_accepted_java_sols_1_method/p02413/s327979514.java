import java.io.PrintWriter;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PrintWriter pw = new PrintWriter(System.out);

    int r = sc.nextInt();
    int c = sc.nextInt();

    int[][] table = new int[r+1][c+1];
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            table[i][j] = sc.nextInt();
        }
        table[i][c] = IntStream.of(table[i]).sum();
    }

    for (int i = 0; i <= c; i++) {
      for (int j = 0; j < r; j++) {
        table[r][i] += table[j][i];
      }
    }

    for (int[] row : table) {
        String str = "";
        for (int cell : row) {
            str += cell + " ";
        }
        pw.println(str.trim());
    }

    pw.flush();
    sc.close();
  }
}
