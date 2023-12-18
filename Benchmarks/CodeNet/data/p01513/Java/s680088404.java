import java.util.*;

/**
 * AOJ #2399 Save Your Privacy!
 */
class Main {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) { break; }
            List<Set<Integer>> list = new ArrayList<Set<Integer>>(n);
            for (int i = 0; i < n; i++) {
                list.add(readOneSet(scanner));
            }
            Set<Integer> leaked = readOneSet(scanner);
            System.out.println(findLeaker(list, leaked));
        }
    }

    static int findLeaker(List<Set<Integer>> list, Set<Integer> leaked) {
        int leaker = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).containsAll(leaked)) {
                if (leaker != -1) { return -1; }
                leaker = i + 1;  // member id is between 1 and n
            }
        }
        return leaker;
    }

    static Set<Integer> readOneSet(Scanner scanner) {
        Set<Integer> set = new TreeSet<Integer>();
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            set.add(scanner.nextInt());
        }
        return set;
    }
}