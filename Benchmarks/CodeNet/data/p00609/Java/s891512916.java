/*
 * Main.java: 1023: Amazing Graze
 */

import java.util.*;

public class Main {
  // constant

  static final int MAX_CRD = 10000;
  static final int NUM_DIV = 40;

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
      for (int i = 0; i < NUM_DIV * NUM_DIV; i++)
	ars.add(new ArrayList<int[]>());

      for (int i = 0; i < an; i++) {
	int ax = sc.nextInt();
	int ay = sc.nextInt();

	int xi = ax / sql;
	int yi = ay / sql;

	int[] axy = {ax, ay};
	ars.get(yi * NUM_DIV + xi).add(axy);
      }

      long power = 0;

      for (int i = 0; i < bn; i++) {
	int bx = sc.nextInt();
	int by = sc.nextInt();

	int bxi = bx / sql;
	int byi = by / sql;

	for (int dxi = -1; dxi <= 1; dxi++) {
	  int xi = bxi + dxi;
	  if (xi < 0 || xi >= NUM_DIV) continue;

	  for (int dyi = -1; dyi <= 1; dyi++) {
	    int yi = byi + dyi;
	    if (yi < 0 || yi >= NUM_DIV) continue;

	    for (int[] axy: ars.get(yi * NUM_DIV + xi)) {
	      int dx = axy[0] - bx;
	      int dy = axy[1] - by;
	      if (dx * dx + dy * dy <= rr4)
		power++;
	    }
	  }
	}
      }

      System.out.println(power);
    }
  }
}