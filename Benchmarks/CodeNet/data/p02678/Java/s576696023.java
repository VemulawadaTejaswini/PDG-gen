import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Map<Integer, Room> map = new HashMap<>();
        Map<Integer, Room> labeled = new HashMap<>();

        for (int i = 1; i <= m; i++) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();

            // from -> to
            addRoute(map, labeled, from, to);
            // to -> from
            addRoute(map, labeled, to, from);
        }

        Room root = map.get(1);
        addLabel(map, labeled, 1, root.routes, 1, n);

        if (labeled.size() == n) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        for (int num = 2; num <= n; num++) {
            Room room = map.get(num);
            System.out.println(room.label);
        }
    }

    static void addLabel(Map<Integer, Room> map, Map<Integer, Room> labeled, int source, Set<Integer> routes, int depth, int n) {
//        System.out.println(source + ":" + depth + ":" + routes);
//        System.out.println(labeled);
        if (depth >= n || labeled.size() == n) {
            return;
        }


        Map<Integer, Set<Integer>> target = new HashMap<>();
        for (int number : routes) {
            Room r = map.get(number);
            if (!r.isLabeled() || r.depth > depth) {
                r.label = source;
                r.depth = depth;
                labeled.put(r.number, r);
            }
            Set<Integer> targetRoutes = new HashSet<>();
            target.put(r.number, targetRoutes);
            for (int num : r.routes) {
                if (!labeled.containsKey(num) || labeled.get(num).depth > (depth + 1)) {
                    targetRoutes.add(num);
                }
            }
        }

        for(Map.Entry<Integer, Set<Integer>> entryr : target.entrySet()){
            addLabel(map, labeled, entryr.getKey(), entryr.getValue(), depth + 1, n);
        }
    }

    static void addRoute(Map<Integer, Room> map, Map<Integer, Room> labeled, int from, int to) {
        if (!map.containsKey(from)) {
            map.put(from, new Room(from));
        }
        Room room = map.get(from);
        room.addRoute(to);
        if (room.isLabeled()) {
            labeled.put(room.number, room);
        }
    }

    static class Room {
        int number;
        Set<Integer> routes;
        int label = -1;
        int depth = 0;

        public Room(int number) {
            this.number = number;
            routes = new HashSet<>();
            if (number == 1) {
                label = 0;
            }
        }

        public void addRoute(Integer route) {
            this.routes.add(route);
        }

        public boolean isLabeled() {
            return label >= 0;
        }

        public String toString() {
            return number + ":" + routes + ":" + label;
        }
    }

}