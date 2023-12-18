import java.io.PrintWriter;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PrintWriter pw = new PrintWriter(System.out);

    int[][][] residence = new int[4][3][10];
    int n = sc.nextInt();

    IntStream.range(0, n).forEach(i -> {
        int b = sc.nextInt() - 1;
        int f = sc.nextInt() - 1;
        int r = sc.nextInt() - 1;
        int v = sc.nextInt();
        
        residence[b][f][r] += v;
    });

    for (int i = 0; i < residence.length; i++) {
        for (int j = 0; j < residence[i].length; j++) {
            for (int k = 0; k < residence[i][j].length; k++) {
                pw.print(" " + residence[i][j][k]);
            }
            pw.println();
        }

        if (i != residence.length - 1) {
            pw.println("####################");
        }
    }

    pw.flush();
    sc.close();
  }
}
