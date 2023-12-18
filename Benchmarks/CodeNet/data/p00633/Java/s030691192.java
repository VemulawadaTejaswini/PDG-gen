import java.util.*;

public class Main {
  // inner classes

  static class Circle {
    double x, y, r;

    Circle(double x, double y, double r) {
      this.x = x;
      this.y = y;
      this.r = r;
    }
  }

  static class ArcRange implements Comparable<ArcRange> {
    double th0, th1;

    ArcRange(double th0, double th1) {
      this.th0 = th0;
      this.th1 = th1;
    }

    public int compareTo(ArcRange ar) {
      int c = Double.compare(this.th0, ar.th0);
      return (c != 0) ? c : Double.compare(this.th1, ar.th1);
    }

    ArcRange copy() {
      return new ArcRange(this.th0, this.th1);
    }
  }

  // subroutines

  static boolean check_cross(Circle ca, Circle cb, ArcRange ara, ArcRange arb) {
    double vx = cb.x - ca.x;
    double vy = cb.y - ca.y;

    double dv2 = vx * vx + vy * vy;
    double dv = Math.sqrt(dv2);

    if (dv >= ca.r + cb.r || dv <= Math.abs(ca.r - cb.r))
      return false;

    double car2 = ca.r * ca.r;
    double cbr2 = cb.r * cb.r;

    double th0 = Math.atan2(vy, vx);
    double th1 = Math.atan2(-vy, -vx);
    double tha = Math.acos((dv2 + car2 - cbr2) / (2 * dv * ca.r));
    double thb = Math.acos((dv2 + cbr2 - car2) / (2 * dv * cb.r));

    ara.th0 = th0 - tha;
    ara.th1 = th0 + tha;
    arb.th0 = th1 - thb;
    arb.th1 = th1 + thb;
    return true;
  }

  // main
  public static final void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    for (;;) {
      int n = sc.nextInt();
      if (n == 0) break;

      Circle[] cs = new Circle[n];
      for (int i = 0; i < n; i++) {
	double x = sc.nextDouble();
	double y = sc.nextDouble();
	double r = sc.nextDouble();
	cs[i] = new Circle(x, y, r);
      }
      //p cs

      ArrayList<ArrayList<ArcRange>> carcs =
	new ArrayList<ArrayList<ArcRange>>();
      for (int i = 0; i < n; i++)
	carcs.add(new ArrayList<ArcRange>());

      ArcRange ara = new ArcRange(0.0, 0.0);
      ArcRange arb = new ArcRange(0.0, 0.0);

      for (int i = 0; i < n; i++)
	for (int j = i + 1; j < n; j++) {
	  if (check_cross(cs[i], cs[j], ara, arb)) {
	    carcs.get(i).add(new ArcRange(ara.th0, ara.th1));
	    carcs.get(j).add(new ArcRange(arb.th0, arb.th1));
	  }
	}
      //p ignore
      //p carcs

      double sum = 0.0;

      ArrayList<ArcRange> arcs = new ArrayList<ArcRange>();
      ArrayList<ArcRange> marcs = new ArrayList<ArcRange>();

      for (int i = 0; i < n; i++) {
	double mth = 0.0;

	if (! carcs.get(i).isEmpty()) {
	  arcs.clear();

	  for (ArcRange arc: carcs.get(i)) {
	    double a0 = arc.th0;
	    double a1 = arc.th1;

	    if (a0 < -Math.PI) {
	      arcs.add(new ArcRange(-Math.PI, a1));
	      arcs.add(new ArcRange(a0 + 2 * Math.PI, Math.PI));
	    }
	    else if (a1 > Math.PI) {
	      arcs.add(new ArcRange(-Math.PI, a1 - 2 * Math.PI));
	      arcs.add(new ArcRange(a0, Math.PI));
	    }
	    else
	      arcs.add(arc.copy());
 }

	  marcs.clear();

	  ArcRange[] arcs0 = arcs.toArray(new ArcRange[arcs.size()]);
	  Arrays.sort(arcs0);

	  int pos = 0;
	  ArcRange arc = arcs.get(pos++);

	  while (pos < arcs.size()) {
	    ArcRange arc0 = arcs.get(pos++);

	    if (arc.th1 < arc0.th0) {
	      marcs.add(arc);
	      arc = arc0;
	    }
	    else if (arc0.th1 < arc.th0) {
	      marcs.add(arc0);
	    }
	    else {
	      double a0 = (arc.th0 < arc0.th0) ? arc.th0 : arc0.th0;
	      double a1 = (arc.th1 > arc0.th1) ? arc.th1 : arc0.th1;
	      arc = new ArcRange(a0, a1);
	    }
	  }

	  marcs.add(arc);
	  //p marcs

	  for (ArcRange marc: marcs)
	    mth += marc.th1 - marc.th0;
	}

	sum += (2 * Math.PI - mth) * cs[i].r;
      }

      System.out.printf("%.12f\n", sum);
    }
  }
}