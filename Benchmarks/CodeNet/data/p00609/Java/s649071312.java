/*
 * Main.java: 1023: Amazing Graze
 */

import java.util.*;

public class Main {
  // constant

  static final int MAX_CRD = 10000;
  static final int NUM_DIV = 100;

  // main
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    int sql = MAX_CRD / NUM_DIV;

    for (;;) {
      int an = sc.nextInt();
      int bn = sc.nextInt();
      int r = sc.nextInt();
      if ((an | bn | r) == 0) break;

      int r4 = r * 4;
      int rr4 = r4 * r4;

      ArrayList<ArrayList<int[]>> ars = new ArrayList<ArrayList<int[]>>();
      for (int i = 0; i < an; i++)
	ars.add(new ArrayList<int[]>());

      for (int i = 0; i < an; i++) {
	int ax = sc.nextInt();
	int ay = sc.nextInt();

	int xi = ax / sql;
	int yi = ay / sql;

	int[] axy = {ax, ay};
	ars.get(yi * NUM_DIV + xi).add(axy);

	int rx0 = xi * sql;
	int ry0 = yi * sql;
	int rx1 = rx0 + sql;
	int ry1 = ry0 + sql;

	int dx0 = ax - rx0;
	int dy0 = ay - ry0;
	int dx1 = rx1 - ax;
	int dy1 = ry1 - ay;

	int dx02 = dx0 * dx0;
	int dx12 = dx1 * dx1;
	int dy02 = dy0 * dy0;
	int dy12 = dy1 * dy1;

	if (xi > 0 && dx0 < r4)
	  ars.get(yi * NUM_DIV + (xi - 1)).add(axy);
	if (xi < NUM_DIV - 1 && dx1 <= r4)
	  ars.get(yi * NUM_DIV + (xi + 1)).add(axy);
	if (yi > 0 && dy0 < r4)
	  ars.get((yi - 1) * NUM_DIV + xi).add(axy);
	if (yi < NUM_DIV - 1 && dy1 <= r4)
	  ars.get((yi + 1) * NUM_DIV + xi).add(axy);

	if (xi > 0 && yi > 0 && dx02 + dy02 < rr4)
	  ars.get((yi - 1) * NUM_DIV + (xi - 1)).add(axy);
	if (xi < NUM_DIV - 1 && yi > 0 && dx12 + dy02 < rr4)
	  ars.get((yi - 1) * NUM_DIV + (xi + 1)).add(axy);
	if (xi > 0 && yi < NUM_DIV - 1 && dx02 + dy12 < rr4)
	  ars.get((yi + 1) * NUM_DIV + (xi - 1)).add(axy);
	if (xi < NUM_DIV - 1 && yi < NUM_DIV - 1 && dx12 + dy12 <= rr4)
	  ars.get((yi + 1) * NUM_DIV + (xi + 1)).add(axy);
      }

      long power = 0;

      for (int i = 0; i < bn; i++) {
	int bx = sc.nextInt();
	int by = sc.nextInt();

	int xi = bx / sql;
	int yi = by / sql;

	for (int[] axy: ars.get(yi * NUM_DIV + xi)) {
	  int dx = axy[0] - bx;
	  int dy = axy[1] - by;
	  if (dx * dx + dy * dy <= rr4)
	    power++;
	}
      }

      System.out.println(power);
    }
  }
}