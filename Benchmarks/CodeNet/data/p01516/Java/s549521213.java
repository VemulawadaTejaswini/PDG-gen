import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
 List<Star>                stars  = new LinkedList<Star>();
 HashMap<Set<Star>, Route> routes = new HashMap<Set<Star>, Route>();

 public Main(int n) {
 }

 void add(int index, Star s) {
	stars.add(s);
	createRoute(s);
 }

 void createRoute(Star s) {
	HashSet<Star> set = new HashSet<Star>();
	for (Star target : stars) {
	 Bridge bridge = new Bridge(target, s);
	 set.clear();
	 set.addAll(Arrays.asList(s, target));
	 Route route;
	 if (routes.containsKey(set)) {
		route = routes.get(set);
		if (route.getLength() >= bridge.getLength()) route
		  .set(bridge);
	 } else {
		route = new Route(s, bridge, target);
		routes.put(set, route);
		for (Star s2 : stars) {
		 set.clear();
		 set.addAll(Arrays.asList(s2, target));
		 Route newR = new Route(s, route, routes.get(set), s2);
		 routes.put(new HashSet<Star>(Arrays.asList(s, s2)),
			 newR);
		}
	 }
	}
 }

 double getLength(int num, int num2) {
	Star s1 = stars.get(num - 1);
	Star s2 = stars.get(num2 - 1);
	final List<Star> asList = Arrays.asList(s1, s2);
	final HashSet<Star> hashSet = new HashSet<Star>(asList);
	return routes.get(hashSet).getLength();

 }

 public static void main(String[] args) {
	Scanner in = new Scanner("1 1 1" +
	  " 5 5 0 5" +
	  " 2 1 2" +
	  " 5 5 0 5" +
	  " 15 5 0 5" +
	  " 3 2 3" +
	  " 15 15 0 5" +
	  " 5 5 10 5" +
	  " 25 25 20 5" +
	  " 0 0 0");
	while (in.hasNext()) {
	 int n = in.nextInt();
	 int m = in.nextInt();
	 int l = in.nextInt();
	 if (n != 0) {
		Main main = new Main(n);
		for (int i = 0; i < n; i++) {
		 int x = in.nextInt();
		 int y = in.nextInt();
		 int theta = in.nextInt();
		 int r = in.nextInt();
		 Star star = new Star(x, y, theta, r);
		 main.add(i, star);
		}
		System.out.println(main.getLength(m, l));
	 }
	}
 }
}

class Star {
 static AffineTransform affin = new AffineTransform();
 final int              x, y;
 final List<Point2D>    pts;

 Star(int x, int y, int theta, int r) {
	this.x = x;
	this.y = y;
	Point2D.Double orign = new Point2D.Double(x, y + r);
	final List<Point2D> tg = new ArrayList<Point2D>();
	for (int i = 0; i < 5; i++) {
	 final double j = Math.toRadians(theta + 360 / 5 * 2 * i);
	 affin.setToRotation(j, x, y);
	 final Point2D setP =
		 affin.transform(orign, new Point2D.Double());
	 tg.add(setP);
	}
	pts = Collections.unmodifiableList(tg);
 }

 static double getSpan(Star s1, Star s2) {
	final Line2D.Double s1L = new Line2D.Double();
	final Line2D.Double s2L = new Line2D.Double();
	double min = Double.MAX_VALUE;
	for (int i = 0; i < 5; i++) {
	 if (min != 0.0) {
		s1L.setLine(s1.pts.get(i), s1.pts.get((i + 1) % 5));
		for (int j = 0; j < 5; j++) {
		 s2L.setLine(s2.pts.get(j), s2.pts.get((j + 1) % 5));
		 if (min == 0.0 || s1L.intersectsLine(s2L)) {
			min = 0.0;
		 } else {
			min = Math.min(min, s1L.ptSegDist(s2L.x1, s2L.y1));
			min = Math.min(min, s1L.ptSegDist(s2L.x2, s2L.y2));
			min = Math.min(min, s2L.ptSegDist(s1L.x1, s1L.y1));
			min = Math.min(min, s2L.ptSegDist(s1L.x2, s1L.y2));
		 }
		}
	 }
	}
	return min;
 }
}

abstract class Road {
 abstract double getLength();
}

class Route extends Road {
 final Set<Star>  sideStar;
 final List<Road> route = new LinkedList<Road>();

 Route(Star s1, Bridge bridge, Star s2) {
	this.sideStar = new HashSet<Star>(Arrays.asList(s1, s2));
	route.add(bridge);
 }

 public Route(Star s1, Route route2, Route route3, Star s2) {
	this.sideStar = new HashSet<Star>(Arrays.asList(s1, s2));
	route.add(route2);
	route.add(route3);
 }

 void set(Road... routes) {
	route.clear();
	route.addAll(Arrays.asList(routes));
 }

 @Override
 double getLength() {
	double result = 0.0;
	for (Road r : route) {
	 result += r.getLength();
	}
	return result;
 }
}

class Bridge extends Road {
 final double span;

 Bridge(Star s1, Star s2) {
	span = Star.getSpan(s1, s2);
 }

 @Override
 double getLength() {
	return span;
 }
}