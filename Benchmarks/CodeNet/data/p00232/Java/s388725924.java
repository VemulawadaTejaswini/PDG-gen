import java.util.*;

public class Main {
  // constant

  // inner classes

  // global variables
  static int x, y, z;

  static int[] rlts;
  static int[][] brds;
  static ArrayList<HashMap<Integer, Double>> mcache;

  // subroutines

  static double exp_money(int pos, int money) {
    if (pos >= y) return money;

    if (mcache.get(pos).get(money) != null)
      return mcache.get(pos).get(money);

    int e = brds[pos][0];
    int a = brds[pos][1];

    switch (e) {
    case 1:
      double mny = exp_money(pos + a, money);
      mcache.get(pos).put(money, mny);
      return mny;
    case 2:
      money += a;
      break;
    case 3:
      money = (money >= a) ? money - a : 0;
      break;
    }

    double msum = 0.0;

    for (int v: rlts)
      msum += exp_money(pos + v, money);

    double mny = msum / x;
    mcache.get(pos).put(money, mny);
    return mny;
  }

  // main
  public static final void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    for (;;) {
      x = sc.nextInt();
      y = sc.nextInt();
      z = sc.nextInt();
      //System.out.printf("x=%d,y=%d,z=%d\n", x, y, z);
      if (x == 0 && y == 0 && z == 0) break;

      rlts = new int[x];

      for (int i = 0; i < x; i++)
        rlts[i] = sc.nextInt();

      brds = new int[y][2];
      mcache = new ArrayList<HashMap<Integer, Double>>();

      for (int i = 0; i < y; i++) {
        brds[i][0] = brds[i][1] = 0;
        mcache.add(new HashMap<Integer, Double>());
      }

      for (int i = 0; i < z; i++) {
        int bn = sc.nextInt();
        int e  = sc.nextInt();
        int a  = sc.nextInt();
        //System.out.printf("bn=%d,e=%d,a=%d\n", bn, e, a);

        brds[bn][0] = e;
        brds[bn][1] = a;
      }

      double mny = exp_money(0, 0);

      System.out.println((int)mny);
    }
  }
}