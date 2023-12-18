import java.util.*;

public class Main {

  Scanner sc;

  Main() {
    sc = new Scanner(System.in);
  }

  int ni() {
    return sc.nextInt();
  }

  public static void main(String[] args) {
    new Main().run();
  }

  class Disk {
    LinkedList<Disk> parents = new LinkedList<>();
    LinkedList<Disk> children = new LinkedList<>();
    int x;
    int y;
    int c;
    int r;

    boolean isIn(Disk disk) {
      return Math.pow(this.r + disk.r, 2) > Math.pow(this.x - disk.x, 2) + Math.pow(this.y - disk.y, 2);
    }
  }

  void run() {
    for (; ; ) {
      int n = ni();
      if (n == 0) {
        break;
      }
      ArrayList<Disk> list = new ArrayList<>();
      for (int i = 0; i < n; ++i) {
        Disk d = new Disk();
        d.x = ni();
        d.y = ni();
        d.r = ni();
        d.c = ni();

        for (int j = 0; j < i; ++j) {
          Disk e = list.get(j);
          if (e.isIn(d)) {
            e.children.add(d);
            d.parents.add(e);
          }
        }
        list.add(d);
      }

      int cnt = 0;
      for (; ; ) {
        boolean flag = true;
        HashMap<Integer, Disk> map = new HashMap<>();
        for (Disk d : list) {
          if (d.parents.size() == 0) {
            if (map.containsKey(d.c)) {
              Disk e = map.get(d.c);
              e.children.forEach(c -> c.parents.remove(e));
              d.children.forEach(c -> c.parents.remove(d));
              list.remove(d);
              list.remove(e);
              ++cnt;
              flag = false;
              break;
            } else {
              map.put(d.c, d);
            }
          }
        }
        if (flag) {
          break;
        }
      }
      System.out.println(cnt * 2);
    }
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}