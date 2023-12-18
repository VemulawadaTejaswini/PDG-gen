import java.util.*;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }
  public void run() {
    List<Color> initialStones = new ProblemReader().read();
    int minOperationCount = new Solver().getMinOperationCount(initialStones);
    System.out.println(minOperationCount);
  }
static class ProblemReader {
  public List<Color> read() {
    Scanner stdinScanner = new Scanner(System.in);
    int stoneCount = stdinScanner.nextInt();
    String stoneMarks = stdinScanner.next();
    List<Color> stones = new ArrayList<>();
    for (int idx = 0; idx < stoneCount; idx++) {
      char stoneMark = stoneMarks.charAt(idx);
      if (stoneMark == 'R') {
        stones.add(Color.RED);
      } else {
        stones.add(Color.WHITE);
      }
    }
    return stones;
  }
}
static class Solver {
  public int getMinOperationCount(List<Color> initialStones) {
    int whiteOnLeft = 0;
    int redOnRight = initialStones.size();
    int minOperationCount = initialStones.size();
    for (int separator = 0; separator <= initialStones.size(); separator++) {
      int operationCount = Math.max(whiteOnLeft, redOnRight);
      if (minOperationCount > operationCount) {
        minOperationCount = operationCount;
      }
      if (separator < initialStones.size()) {
        if (initialStones.get(separator) == Color.RED) {
          redOnRight--;
        } else {
          whiteOnLeft++;
        }
      } else {
        // already we have minimum value.
        // nothing to do.
      }
    }
    return minOperationCount;
  }
}
}
enum Color {
  RED,
  WHITE,
  ;
}
