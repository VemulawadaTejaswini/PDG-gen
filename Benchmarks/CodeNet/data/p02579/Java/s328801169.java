import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {

  private static final char BLOCK = '#';
  private static final char ROAD = '.';

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int h = Integer.parseInt(sc.next());
    int w = Integer.parseInt(sc.next());
    Position c = Position.of(
      Integer.parseInt(sc.next()) - 1,
      Integer.parseInt(sc.next()) - 1
    );
    Position d = Position.of(
      Integer.parseInt(sc.next()) - 1,
      Integer.parseInt(sc.next()) - 1
    );
    char meiro[][] = new char[h][w];
    for (int i = 0; i < h; i++) {
      String line = sc.next();
      for (int j = 0; j < w; j++) {
        meiro[i][j] = line.charAt(j);
      }
    }
    WholeArea wholeArea = new WholeArea(h, w, meiro);
    Set<ClosedArea> closedAreas = new HashSet<>();
    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        if (meiro[i][j] == BLOCK) {
          continue;
        }
        Position p = Position.of(i, j);
        if (closedAreas.stream().anyMatch(area -> area.contains(p))) {
          continue;
        }
        // new closed area
        closedAreas.add(searchClosedArea(p, wholeArea));
      }
    }
    ClosedArea goal = closedAreas.stream().filter(area -> area.contains(d)).findFirst().get();
    ClosedArea start = closedAreas.stream().filter(area -> area.contains(c)).findFirst().get();
    Set<ClosedArea> searched = new HashSet<>();
    Queue<ClosedArea> bfs = new LinkedList<>();
    bfs.add(goal);
    ClosedArea target;
    while ((target = bfs.poll()) != null) {
      if (searched.contains(target)) {
        continue;
      }
      if (target.equals(start)) {
        pw.println(target.distance);
        return;
      }
      searched.add(target);
      int currentDistance = target.distance;
      for (Position p : target.positions) {
        closedAreas.stream()
          .filter(area -> !bfs.contains(area))
          .filter(area -> !searched.contains(area))
          .filter(area -> area.canWarpFrom(p))
          .forEach(area -> {
            area.distance = currentDistance + 1;
            bfs.add(area);
          });
      }
    }
    pw.println(-1);
  }

  static ClosedArea searchClosedArea(Position start, WholeArea wholeArea) {
    ClosedArea area = new ClosedArea();
    Queue<Position> bfs = new LinkedList<>();
    bfs.add(start);
    Position target;
    while ((target = bfs.poll()) != null) {
      if (area.contains(target)) {
        continue;
      }
      area.add(target);
      {
        int nextI = target.h + 1;
        int nextJ = target.w;
        if (wholeArea.isRoad(nextI, nextJ)) {
          Position p = Position.of(nextI, nextJ);
          if (!area.contains(p) && !bfs.contains(p)) {
            bfs.add(p);
          }
        }
      }
      {
        int nextI = target.h - 1;
        int nextJ = target.w;
        if (wholeArea.isRoad(nextI, nextJ)) {
          Position p = Position.of(nextI, nextJ);
          if (!area.contains(p) && !bfs.contains(p)) {
            bfs.add(p);
          }
        }
      }
      {
        int nextI = target.h;
        int nextJ = target.w + 1;
        if (wholeArea.isRoad(nextI, nextJ)) {
          Position p = Position.of(nextI, nextJ);
          if (!area.contains(p) && !bfs.contains(p)) {
            bfs.add(p);
          }
        }
      }
      {
        int nextI = target.h;
        int nextJ = target.w - 1;
        if (wholeArea.isRoad(nextI, nextJ)) {
          Position p = Position.of(nextI, nextJ);
          if (!area.contains(p) && !bfs.contains(p)) {
            bfs.add(p);
          }
        }
      }
    }
    return area;
  }

  static class WholeArea {

    int h;
    int w;
    char[][] area;

    WholeArea(int h, int w, char[][] area) {
      this.h = h;
      this.w = w;
      this.area = area;
    }

    char get(int i, int j) {
      if (i >= 0 && i < h && j >= 0 && j < w) {
        return area[i][j];
      }
      return BLOCK;
    }

    boolean isRoad(int i, int j) {
      return get(i, j) == ROAD;
    }
  }

  static class ClosedArea {

    int distance;

    Set<Position> positions = new HashSet<>();
    Set<Position> warpCache = new HashSet<>();

    boolean canWarpFrom(Position from) {
      if (warpCache.contains(from)) {
        return true;
      }
      boolean canWarp = positions.stream().anyMatch(p -> p.canWarpFrom(from));
      if (canWarp) {
        warpCache.add(from);
        return true;
      }
      return false;
    }

    boolean contains(Position position) {
      return positions.contains(position);
    }

    void add(Position position) {
      positions.add(position);
    }
  }

  static class Position {

    static Position cache[][] = new Position[10000][10000];

    int h;
    int w;

    public Position(int h, int w) {
      this.h = h;
      this.w = w;
    }

    static Position of(int h, int w) {
      if (cache[h][w] != null) {
        return cache[h][w];
      }
      Position p = new Position(h, w);
      cache[h][w] = p;
      return p;
    }

    boolean canWarpFrom(Position from) {
      return Math.abs(h - from.h) <= 2 && Math.abs(w - from.w) <= 2;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (o == null || getClass() != o.getClass()) {
        return false;
      }
      Position position = (Position) o;
      return h == position.h &&
        w == position.w;
    }

    @Override
    public int hashCode() {
      return Objects.hash(h, w);
    }
  }
}
