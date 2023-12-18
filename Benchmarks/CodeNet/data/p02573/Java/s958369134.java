import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    int belongGroupIndex[] = new int[n + 1];
    int groupToMemberCount[] = new int[n];
    int groupIndex = 0;
    for (int i = 0; i < n + 1; i++) {
      belongGroupIndex[i] = -1;
    }
    for (int i = 0; i < n; i++) {
      groupToMemberCount[i] = -1;
    }
    for (int i = 0; i < m; i++) {
      int from = Integer.parseInt(sc.next());
      int to = Integer.parseInt(sc.next());
      if (belongGroupIndex[from] == -1 && belongGroupIndex[to] == -1) {
        belongGroupIndex[from] = groupIndex;
        belongGroupIndex[to] = groupIndex;
        groupToMemberCount[groupIndex] = 2;
        groupIndex++;
      } else if (belongGroupIndex[from] == -1 && belongGroupIndex[to] != -1) {
        int toGroupIndex = belongGroupIndex[to];
        belongGroupIndex[from] = toGroupIndex;
        groupToMemberCount[toGroupIndex]++;
      } else if (belongGroupIndex[from] != -1 && belongGroupIndex[to] == -1) {
        int fromGroupIndex = belongGroupIndex[from];
        belongGroupIndex[to] = fromGroupIndex;
        groupToMemberCount[fromGroupIndex]++;
      } else {
        int toGroupIndex = belongGroupIndex[to];
        int fromGroupIndex = belongGroupIndex[from];
        if (toGroupIndex == fromGroupIndex) {
          continue;
        }
        for (int j = 0; j < n; j++) {
          if (belongGroupIndex[j] == toGroupIndex) {
            belongGroupIndex[j] = fromGroupIndex;
          }
        }
        groupToMemberCount[fromGroupIndex] += groupToMemberCount[toGroupIndex];
      }
    }
    pw.println(
      Arrays.stream(groupToMemberCount)
        .filter(i -> i >= 0)
        .max()
        .orElse(1)
    );
  }

}
