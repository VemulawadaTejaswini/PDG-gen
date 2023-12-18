import java.util.*;

public class Main {
  public static void main(String[] args) {
    new Main().run();
  }

  private void run() {
    while(sc.hasNext()) {
      final int n = sc.nextInt();

      if(n == 0) break;

      Map<String, Integer> prices = new HashMap<String, Integer>();

      for(int i = 0; i < n; i++) {
        final String name = sc.next();
        final int price = sc.nextInt();

        prices.put(name, price);
      }

      final int m = sc.nextInt();
      final Map<String, List<String>> recipes = new HashMap<String, List<String>>();

      for(int i = 0; i < m; i++) {
        final String item = sc.next();
        final int k = sc.nextInt();

        final List<String> ingredients = new ArrayList<String>();
        for(int j = 0; j < k; j++) {
          ingredients.add(sc.next());
        }

        recipes.put(item, ingredients);
      }


      for(int i = 0; i < m; i++) {
        Map<String, Integer> new_prices = new HashMap<String, Integer>(prices);

        for(Map.Entry<String, List<String>> e : recipes.entrySet()) {
          final String item = e.getKey();

          final int price = prices.containsKey(item) ? prices.get(item) : INFINITY;

          int sum = 0;
          for(String ingr : e.getValue()) {
            sum += prices.containsKey(ingr) ? prices.get(ingr) : INFINITY;
          }

          if(sum < price) new_prices.put(item, sum);
        }

        prices = new_prices;
      }

      final String item = sc.next();

      System.out.println(prices.get(item));
    }
  }

  private Scanner sc = new Scanner(System.in);
  private static final int INFINITY = 100000000;
}