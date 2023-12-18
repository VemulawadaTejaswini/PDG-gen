import java.util.*;

public class Main {
  // global variables

  static HashMap<String, Integer> prices;
  static HashMap<String, ArrayList<String>> recipes;
  static HashMap<String, Integer> mccache;

  // subroutines

  static int min_cost(String item) {
    if (mccache.containsKey(item))
      return mccache.get(item).intValue();

    ArrayList<String> rcp = recipes.get(item);
    if (rcp == null) {
      Integer prc = prices.get(item);
      mccache.put(item, prc);
      return prc.intValue();
    }

    int sum = 0;

    for (String item1: rcp)
      sum += min_cost(item1);

    int pr = prices.get(item);
    int mci = (pr < sum) ? pr : sum;
    mccache.put(item, mci);

    return mci;
  }

  // main
  public static final void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

    for (;;) {
      int n = sc.nextInt();
      if (n == 0) break;

      prices = new HashMap<String, Integer>();

      for (int id = 0; id < n; id++) {
        String item = sc.next();
        int price = sc.nextInt();
        prices.put(item, price);
        //System.out.println(item + " = " + price);
      }

      recipes = new HashMap<String, ArrayList<String>>();

      int m = sc.nextInt();

      for (int i = 0; i < m; i++) {
        String item = sc.next();
        int k = sc.nextInt();
        //System.out.print(item + "(" + k + "):");

        ArrayList<String> rcpi = new ArrayList<String>();
        recipes.put(item, rcpi);
        for (int j = 0; j < k; j++) {
          String item1 = sc.next();
          rcpi.add(item1);
          //System.out.print(" " + item1);
        }
        //System.out.println("");
      }

      String target = sc.next();

      mccache = new HashMap<String, Integer>();

      int mc = min_cost(target);
      System.out.println(mc);
    }
  }
}