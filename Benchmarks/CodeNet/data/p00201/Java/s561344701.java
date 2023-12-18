
import java.util.*;

class Main {

    Scanner sc;
    HashMap<Integer, Integer> itemList;
    HashMap<String, Integer> key;
    LinkedList<LinkedList<Integer>> itemComb;

    long solve(int item) {
        long sum = 0;
        if (itemComb.get(item).isEmpty()) {
            return itemList.get(item);
        }
        for (int str : itemComb.get(item)) {
            sum += solve(str);
        }
        return Math.min(itemList.get(item), sum);
    }

    void run() {
        sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            itemList = new HashMap<Integer, Integer>();
            key = new HashMap<String, Integer>();
            itemComb = new LinkedList<LinkedList<Integer>>();
            for (int i = 0; i < n; i++) {
                LinkedList<Integer> tmp = new LinkedList<Integer>();
                String item = sc.next();
                itemList.put(i, sc.nextInt());
                key.put(item, i);
                itemComb.addLast(tmp);
            }
            int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                String item = sc.next();
                int num = sc.nextInt();
                for (int j = 0; j < num; j++) {
                    itemComb.get(key.get(item)).add( key.get(sc.next()) );
                }
            }
            System.out.println(solve( key.get(sc.next()) ) );
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}