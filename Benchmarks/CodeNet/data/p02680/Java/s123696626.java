import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) {
    long answer = solve();
    System.out.println(answer > 0 ? answer : "INF");
  }

  static long solve() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    TreeSet<Integer> xPointSet = new TreeSet<>();
    TreeSet<Integer> yPointSet = new TreeSet<>();
    HashMap<Integer, List<Tupple>> vLineMap = new HashMap<>();
    HashMap<Integer, List<Tupple>> hLineMap = new HashMap<>();
    //縦線の取得
    for (int i = 0; i < n; i++) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      Tupple line = new Tupple(a, b);
      yPointSet.add(c);
      if (vLineMap.containsKey(c)) {
        vLineMap.get(c).add(line);
      } else {
        ArrayList<Tupple> lines = new ArrayList<>();
        lines.add(line);
        vLineMap.put(c, lines);
      }
    }

    //横線の取得
    for (int i = 0; i < m; i++) {
      int d = sc.nextInt();
      int e = sc.nextInt();
      int f = sc.nextInt();
      Tupple line = new Tupple(e, f);
      xPointSet.add(d);
      if (hLineMap.containsKey(d)) {
        hLineMap.get(d).add(line);
      } else {
        ArrayList<Tupple> lines = new ArrayList<>();
        lines.add(line);
        hLineMap.put(d, lines);
      }
    }

    //考慮すべきX座標とY座標のリスト
    int[] xPointArr = new int[xPointSet.size()];
    int index = 0;
    for (Integer x : xPointSet) {
      xPointArr[index] = x.intValue();
      index++;
    }
    Arrays.sort(xPointArr);
    if (xPointArr[0] >= 0 || xPointArr[xPointArr.length - 1] <= 0) {
      return -1;
    }
    int[] yPointArr = new int[yPointSet.size()];
    index = 0;
    for (Integer y : yPointSet) {
      yPointArr[index] = y.intValue();
      index++;
    }
    Arrays.sort(yPointArr);
    if (yPointArr[0] >= 0 || yPointArr[yPointArr.length - 1] <= 0) {
      return -1;
    }
    boolean[][] isVisitTable = new boolean[xPointArr.length - 1][yPointArr.length - 1];
    for (int i = 0; i < isVisitTable.length; i++) {
      Arrays.fill(isVisitTable[i], false);
    }
    boolean[][] isVLineExists = new boolean[xPointArr.length - 1][yPointArr.length];
    for (int i = 0; i < isVLineExists.length; i++) {
      Arrays.fill(isVLineExists[i], false);
    }
    for (int i = 0; i < yPointArr.length; i++) {
      List<Tupple> vLineList = vLineMap.get(yPointArr[i]);
      for (Tupple line : vLineList) {
        for (int j = 1; j < xPointArr.length; j++) {
          if (xPointArr[j - 1] >= line.a && xPointArr[j] <= line.b) {
            isVLineExists[j - 1][i] = true;
          }
        }
      }
    }
    boolean[][] isHLineExists = new boolean[xPointArr.length][yPointArr.length - 1];
    for (int i = 0; i < isHLineExists.length; i++) {
      Arrays.fill(isHLineExists[i], false);
    }
    for (int i = 0; i < xPointArr.length; i++) {
      List<Tupple> hLineList = hLineMap.get(xPointArr[i]);
      for (Tupple line : hLineList) {
        for (int j = 1; j < yPointArr.length; j++) {
          if (yPointArr[j - 1] >= line.a && yPointArr[j] <= line.b) {
            isHLineExists[i][j - 1] = true;
          }
        }
      }
    }
    int startX = 0;
    int startY = 0;
    while (xPointArr[startX + 1] < 0) {
      startX++;
    }
    while (yPointArr[startY + 1] < 0) {
      startY++;
    }
    ArrayDeque<Tupple> queue = new ArrayDeque<>();
    queue.add(new Tupple(startX, startY));
    isVisitTable[startX][startY] = true;
    while (!queue.isEmpty()) {
      Tupple t = queue.poll();
      //Up
      if (!isHLineExists[t.a][t.b]) {
        if (t.a <= 0) {
          return -1;
        }
        if (!isVisitTable[t.a - 1][t.b]) {
          isVisitTable[t.a - 1][t.b] = true;
          queue.add(new Tupple(t.a - 1, t.b));
        }
      }
      //Down
      if (!isHLineExists[t.a + 1][t.b]) {
        if (t.a >= isVisitTable.length - 1) {
          return -1;
        }
        if (!isVisitTable[t.a + 1][t.b]) {
          isVisitTable[t.a + 1][t.b] = true;
          queue.add(new Tupple(t.a + 1, t.b));
        }
      }
      //Left
      if (!isVLineExists[t.a][t.b]) {
        if (t.b <= 0) {
          return -1;
        }
        if (!isVisitTable[t.a][t.b - 1]) {
          isVisitTable[t.a][t.b - 1] = true;
          queue.add(new Tupple(t.a, t.b - 1));
        }
      }
      //Right
      if (!isVLineExists[t.a][t.b + 1]) {
        if (t.b >= isVisitTable[0].length - 1) {
          return -1;
        }
        if (!isVisitTable[t.a][t.b + 1]) {
          isVisitTable[t.a][t.b + 1] = true;
          queue.add(new Tupple(t.a, t.b + 1));
        }
      }
    }
    long answer = 0;
    for (int i = 0; i < isVisitTable.length; i++) {
      for (int j = 0; j < isVisitTable[0].length; j++) {
        if (isVisitTable[i][j]) {
          long xLength = Math.abs(xPointArr[i + 1] - xPointArr[i]);
          long yLength = Math.abs(yPointArr[j + 1] - yPointArr[j]);
          answer += xLength * yLength;
        }
      }
    }
    return answer;
  }

  static class Tupple {

    Tupple(int a, int b) {
      this.a = a;
      this.b = b;
    }

    int a;
    int b;
  }
}