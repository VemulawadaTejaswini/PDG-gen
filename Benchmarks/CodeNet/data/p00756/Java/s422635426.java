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
    int i;
    int c;
    int r;

    boolean isIn(Disk disk) {
      return Math.pow(this.r + disk.r, 2) > Math.pow(this.x - disk.x, 2) + Math.pow(this.y - disk.y, 2);
    }

    public String toString() {
      return "" + i;
    }
  }

  int dfs(ArrayList<Disk> list) {
    HashMap<Integer, ArrayList<Disk>> map = new HashMap<>();
    for (Disk d : list) {
      if (d.parents.size() == 0) {
        if (!map.containsKey(d.c)) {
          map.put(d.c, new ArrayList<>());
        }
        map.get(d.c).add(d);
      }
    }
    int cnt = 0;
    for (int color : map.keySet()) {
      int subcnt = 0;
      int subsubcnt = map.get(color).size() / 2;
      if (map.get(color).size() < 2) {
        continue;
      }
      if (map.get(color).size() % 2 == 1) {
        ArrayList<Disk> arr = map.get(color);

        for (ListIterator<Disk> ite = arr.listIterator(); ite.hasNext(); ) {
          Disk atom = ite.next();
          ite.remove();
          ArrayList<Disk> del = new ArrayList<>();
          for (ListIterator<Disk> jte = arr.listIterator(); jte.hasNext(); ) {
            Disk d = jte.next();
            Disk e = jte.next();
            d.children.forEach(c -> c.parents.remove(d));
            e.children.forEach(c -> c.parents.remove(e));
            list.remove(d);
            list.remove(e);
            del.add(d);
            del.add(e);
          }
          subcnt = Math.max(subcnt, dfs(list));
          for (Disk v : del) {
            v.children.forEach(c -> c.parents.add(v));
            list.add(v);
          }
          ite.add(atom);
        }
      } else {
        ArrayList<Disk> arr = map.get(color);
        ArrayList<Disk> del = new ArrayList<>();
        for (ListIterator<Disk> ite = arr.listIterator(); ite.hasNext(); ) {
          Disk d = ite.next();
          Disk e = ite.next();
          d.children.forEach(c -> c.parents.remove(d));
          e.children.forEach(c -> c.parents.remove(e));
          list.remove(d);
          list.remove(e);
          del.add(d);
          del.add(e);
        }
        subcnt = dfs(list);
        for (Disk v : del) {
          v.children.forEach(c -> c.parents.add(v));
          list.add(v);
        }
      }
      cnt += subcnt;
      cnt += subsubcnt;
    }

    return cnt;
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
        d.i = i;
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

      System.out.println(dfs(list) * 2);
    }
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}