import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var n = Integer.parseInt(br.readLine());
      final var xy = new long[n][2];

      for (int i = 0; i < n; i++) {
        final var line = br.readLine().split(" ");
        xy[i] = new long[2];
        xy[i][0] = Long.parseLong(line[0]);
        xy[i][1] = Long.parseLong(line[1]);
      }

      final var leftMostSet = new TreeSet<Long>();
      var leftMostCoord = Long.MAX_VALUE;
      final var rightMostSet = new TreeSet<Long>();
      var rightMostCoord = Long.MIN_VALUE;
      final var topMostSet = new TreeSet<Long>();
      var topMostCoord = Long.MIN_VALUE;
      final var bottomMostSet = new TreeSet<Long>();
      var bottomMostCoord = Long.MAX_VALUE;

      for (int i = 0; i < n; i++) {
        if (xy[i][0] < leftMostCoord) {
          leftMostSet.clear();
          leftMostSet.add(xy[i][1]);
          leftMostCoord = xy[i][0];
        }

        if (xy[i][0] > rightMostCoord) {
          rightMostSet.clear();
          rightMostSet.add(xy[i][1]);
          rightMostCoord = xy[i][0];
        }

        if (xy[i][1] > topMostCoord) {
          topMostSet.clear();
          topMostSet.add(xy[i][0]);
          topMostCoord = xy[i][1];
        }

        if (xy[i][1] < bottomMostCoord) {
          bottomMostSet.clear();
          bottomMostSet.add(xy[i][0]);
          bottomMostCoord = xy[i][1];
        }
      }

      var cand = Math.abs(rightMostSet.last() - leftMostSet.first())
        + Math.abs(rightMostCoord - leftMostCoord);
      cand = Math.max(
        cand,
        Math.abs(rightMostSet.first() - leftMostSet.last())
        + Math.abs(rightMostCoord - leftMostCoord)
      );
      cand = Math.max(
        cand,
        Math.abs(topMostCoord - leftMostSet.first())
          + Math.abs(leftMostCoord - topMostSet.last())
      );
      cand = Math.max(
        cand,
        Math.abs(bottomMostCoord - leftMostSet.last())
        + Math.abs(leftMostCoord - bottomMostSet.last())
      );
      cand = Math.max(
        cand,
        Math.abs(topMostCoord - rightMostSet.first())
        + Math.abs(rightMostCoord - topMostSet.first())
      );
      cand = Math.max(
        cand,
        Math.abs(bottomMostCoord - rightMostSet.last())
        + Math.abs(rightMostCoord - bottomMostSet.first())
      );

      System.out.println(cand);
    }
  }
}
