
import java.util.*;

class Main {

    Scanner sc;
    HashMap<String, Integer> itemList;
    HashMap<String, LinkedList<String>> itemComb;

    int solve(String item) {
        LinkedList<String> items = itemComb.get(item);
        int sum = 0;
        if (items.isEmpty()) {
            return itemList.get(item);
        }
        for (String str : items) {
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
            itemList = new HashMap<String, Integer>();
            itemComb = new HashMap<String, LinkedList<String>>();
            for (int i = 0; i < n; i++) {
                LinkedList<String> items = new LinkedList<String>();
                String item = sc.next();
                itemList.put(item, sc.nextInt());
                itemComb.put(item,items);
            }
            int m = sc.nextInt();
            for (int i = 0; i < m; i++) {
                String item = sc.next();
                System.out.println(item);
                LinkedList<String> items = new LinkedList<String>();
                int num = sc.nextInt();
                for (int j = 0; j < num; j++) {
                    items.add(sc.next());
                }
                System.out.println(items.isEmpty());
                itemComb.put(item, items);
            }
            System.out.println(solve(sc.next()));
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}