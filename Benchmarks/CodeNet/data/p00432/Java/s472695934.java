import java.util.*;

class Plane {
  public Plane() {
    plane = new ArrayList<Strip>();
    for(int i = 0; i < MAX; i++) plane.add(new Strip());
  }

  public void cover(int x1, int y1, int x2, int y2) {
    for(int i = x1; i < x2; i++) {
      plane.get(i).cover(y1, y2);
    }
  }

  public int area() {
    int area = 0;
    for(Strip s : plane) area += s.area();
    return area;
  }

  public int girth() {
    Strip border = new Strip();
    Strip prev = border;

    int girth = 0;

    for(Strip s : plane) {
      girth += s.girth(prev);
      prev = s;
    }

    girth += border.girth(prev);

    return girth;
  }

  private List<Strip> plane;
  private static final int MAX = 10000;
}

class Strip {
  public void cover(int x, int y) {
    ListIterator<Range> iter = ranges.listIterator(0);
    while(iter.hasNext()) {
      Range r = iter.next();

      int a = r.getStart();
      int b = r.getEnd();

      if(a <= x && y <= b) return;
      else if(x <= a && b <= y) iter.remove();
      else if(a <= x && x <= b) {
        iter.remove();
        x = a;
      }
      else if(x <= a && a <= y) {
        iter.remove();
        y = b;
      }
      else if(y < a) {
        iter.previous();
        iter.add(new Range(x, y));
        return;
      }
    }

    ranges.add(new Range(x, y));
  }

  public int area() {
    int area = 0;
    for(Range r : ranges) area += r.length();
    return area;
  }

  public int girth(Strip left) {
    int girth = 0;

    for(Range r : ranges) girth += 2;

    int cur = 0;

    while(true) {
      Range l = left.getNearestRange(cur);
      Range r = this.getNearestRange(cur);

      if(l == null && r == null) break;
      else if(l == null) {
        if(cur < r.getStart()) cur = r.getStart();
        girth += r.getEnd() - cur;
        cur = r.getEnd();
      }
      else if(r == null) {
        if(cur < l.getStart()) cur = l.getStart();
        girth += l.getEnd() - cur;
        cur = l.getEnd();
      }
      else {
        int ls = l.getStart();
        int rs = r.getStart();
        int le = l.getEnd();
        int re = r.getEnd();

        if(ls <= rs) {
          cur = Math.max(ls, cur);

          if(le <= rs) {
            girth += le - cur;
            cur = le;
          }
          else {
            girth += rs - cur;
            cur = Math.min(le, re);
          }
        }
        else if(rs <= ls) {
          cur = Math.max(rs, cur);

          if(re <= ls) {
            girth += re - cur;
            cur = re;
          }
          else {
            girth += ls - cur;
            cur = Math.min(le, re);
          }
        }
      }
    }

    return girth;
  }

  private Range getNearestRange(int pos) {
    for(Range r : ranges) {
      if(r.getEnd() > pos) return r;
    }

    return null;
  }

  private List<Range> ranges = new LinkedList<Range>();
}

class Range {
  public Range(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public int length() {
    return b - a;
  }

  public int getStart() {
    return a;
  }

  public int getEnd() {
    return b;
  }

  private int a;
  private int b;
}

public class Main {
  private Scanner sc = new Scanner(System.in);

  public void run() {
    while(sc.hasNextInt()) {
      int n = sc.nextInt();
      int r = sc.nextInt();

      if(n == 0 && r == 0) break;

      Plane plane = new Plane();
      for(int i = 0; i < n; i++) {
        plane.cover(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
      }

      System.out.println(plane.area());

      if(r == 2) System.out.println(plane.girth());
    }
  }

  public static void main(String[] args) {
    new Main().run();
  }
}