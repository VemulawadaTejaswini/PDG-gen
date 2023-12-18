import java.io.*;
import java.util.*;

public class Main {
  // global variables

  static HashMap<String, Integer> prices;
  static HashMap<String, ArrayList<String>> recipes;

  // subroutines

  static int min_cost(String item0) {
    Stack<String> stack = new Stack<String>();
    HashMap<String, Integer> mccache = new HashMap<String, Integer>();

    stack.add(item0);

    while (! stack.empty()) {
      String item = stack.peek();

      if (mccache.containsKey(item)) {
        stack.pop();
        continue;
      }

      ArrayList<String> rcp = recipes.get(item);
      if (rcp == null) {
        Integer pri = prices.get(item);
        mccache.put(item, pri);
        stack.pop();
        continue;
      }

      int sum = 0;
      boolean recflag = false;

      for (String item1: rcp) {
        Integer mci = mccache.get(item1);
        if (mci != null)
          sum += mci.intValue();
        else {
          recflag = true;
          stack.push(item1);
        }
      }

      if (recflag) continue;

      int pr = prices.get(item).intValue();
      int ret = (pr < sum) ? pr : sum;
      mccache.put(item, ret);
      stack.pop();
    }

    return mccache.get(item0).intValue();
   }

  // main
  public static final void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      int n = Integer.parseInt(br.readLine().trim());
      if (n == 0) break;

      prices = new HashMap<String, Integer>();

      for (int id = 0; id < n; id++) {
        String[] items = br.readLine().trim().split(" ");
        prices.put(items[0], new Integer(items[1]));
      }

      recipes = new HashMap<String, ArrayList<String>>();

      int m = Integer.parseInt(br.readLine().trim());

      for (int i = 0; i < m; i++) {
        String[] items = br.readLine().trim().split(" ");

        String id = items[0];
        int k = Integer.parseInt(items[1]);

        ArrayList<String> rcpi = new ArrayList<String>();
        recipes.put(id, rcpi);
        for (int j = 0; j < k; j++)
          rcpi.add(items[j + 2]);
      }

      String target = br.readLine().trim();

      int mc = min_cost(target);
      System.out.println(mc);
    }
  }
}